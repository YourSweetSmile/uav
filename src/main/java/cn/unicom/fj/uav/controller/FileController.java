package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    /**
     * 上传文件
     * @param mFile
     * @return
     * @throws Exception
     */
    @PostMapping("/upload")
    public Map uploadFile(@RequestParam("file") MultipartFile mFile) throws Exception {

        return fileService.uploadFile(mFile);
    }

    /**
     * 下载文件
     * @param name
     * @param response
     * @throws Exception
     */
    @GetMapping("/download")
    public void downloadFile(@RequestParam("filename") String name,
                             HttpServletRequest request,
                             HttpServletResponse response) throws Exception {
        fileService.download(name, request, response);
    }
}
