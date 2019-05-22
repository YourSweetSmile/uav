package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public String uploadFile(@RequestParam("file") MultipartFile mFile) throws Exception {

        return fileService.uploadFile(mFile);
    }

    /**
     * 下载文件
     * @param fileName
     * @param response
     * @throws Exception
     */
    @GetMapping("/upload")
    public void downloadFile(
                             HttpServletRequest request,
                             HttpServletResponse response) throws Exception {
        fileService.download(request, response);
    }
}
