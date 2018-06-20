package com.joey.jpademo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author Joey
 * @date 2018-06-20 13:50
 * @desc FileController
 **/
@RequestMapping("/file")
@RestController
public class FileController extends BaseController {

    /**
     * 单文件上传
     * 文件名为UUID
     *
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public String upload(MultipartFile file) {
        File upload = new File("D:\\project\\upload");
        if (!upload.exists()) {
            upload.mkdir();
        }
        //文件后缀
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //文件名
//        String fileName=System.nanoTime()+suffix;
        String fileName = UUID.randomUUID() + suffix;
        File serverFile = new File(upload + "\\" + fileName);
        try {
            file.transferTo(serverFile);
        } catch (IOException e) {
            e.printStackTrace();
            return "fail";
        }
        return "success";
    }


    /**
     * 文件上传方法
     * @param uploadDir
     * @param file
     * @throws IOException
     */
    private void uploadFile(String uploadDir,MultipartFile file) throws IOException {
        //文件后缀
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //文件名
        String fileName = UUID.randomUUID() + suffix;
        File serverFile = new File(uploadDir + "\\" + fileName);
        file.transferTo(serverFile);
    }
}
