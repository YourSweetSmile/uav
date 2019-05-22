package cn.unicom.fj.uav.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * 文件上传
 * @author yinjw
 */
@Service
public class FileService {

    /**读取配置文件获取文件上传目录*/
    @Value("${spring.resources.static-locations}")
    private String uploadFolder;

    public String uploadFile(MultipartFile mFile) throws Exception{

        String f = uploadFolder.substring(uploadFolder.indexOf("/"),uploadFolder.length());
        String str=mFile.getOriginalFilename();
        File file = new File(f +"/"+ str.substring(0,str.lastIndexOf("."))+
                System.currentTimeMillis()+str.substring(str.lastIndexOf("."),str.length()));

        mFile.transferTo(file);

        return "/image/"+file.getName();
    }

    public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String name=request.getParameter("name");
        String filePath = uploadFolder.substring(uploadFolder.indexOf("/"),uploadFolder.length());
        File file = new File(filePath + "/" + name);

        //判断文件父目录是否存在
        if(file.exists()){
            response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "application/octet-stream");

            //获得浏览器信息并转换为大写
            String agent = request.getHeader("User-Agent").toUpperCase();

            //IE浏览器和Edge浏览器
            if (agent.indexOf("MSIE") > 0 || (agent.indexOf("GECKO")>0 && agent.indexOf("RV:11")>0)) {
                name = URLEncoder.encode(name, "UTF-8");
            } else {  //其他浏览器
                name = new String(name.getBytes("UTF-8"), "iso-8859-1");
            }
            response.setHeader("content-disposition", "attachment;filename=" + name);

            byte[] buffer = new byte[1024];

            //文件输入流
            FileInputStream fis = null;
            BufferedInputStream bis = null;

            //输出流
            OutputStream os = null;
            os = response.getOutputStream();
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            int i = bis.read(buffer);
            while(i != -1){
                os.write(buffer);
                i = bis.read(buffer);
            }

            bis.close();
            fis.close();
        }

    }
}
