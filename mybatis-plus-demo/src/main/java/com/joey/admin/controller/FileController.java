package com.joey.admin.controller;

import com.mysql.cj.util.DnsSrv;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author Joey
 */
@Slf4j
@RestController
public class FileController {

    @Value("${app.static-path-prefix}")
    private String staticPathPrefix;

    @Value("${spring.mvc.static-path-pattern}")
    private String staticPathPattern;

    /**
     * 上传单文件
     *
     * @return
     */
    @PostMapping("/upload")
    public ResponseEntity unload(@RequestPart("file") MultipartFile file) {
        if (!file.isEmpty()) {
            String originalFilename = file.getOriginalFilename();
            try {
                file.transferTo(new File(staticPathPrefix + originalFilename));
            } catch (IOException e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("上传失败!");
            }
            log.info(staticPathPattern);
            return ResponseEntity.ok(staticPathPattern.replace("**", "") + originalFilename);
        } else {
            return ResponseEntity.status(HttpStatus.PAYMENT_REQUIRED).body("上传的文件为空!");
        }
    }

    /**
     * 上传多文件
     *
     * @return
     */
    @PostMapping("/uploads")
    public ResponseEntity unload(@RequestPart("files") MultipartFile[] files){
        if (files.length > 0) {
            for (MultipartFile file : files) {
                if (!file.isEmpty()) {
                    String originalFilename = file.getOriginalFilename();
                    try {
                        file.transferTo(new File(staticPathPrefix + originalFilename));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return ResponseEntity.ok("OK");
        } else {
            return ResponseEntity.status(HttpStatus.PAYMENT_REQUIRED).body("上传的文件为空!");
        }
    }
}
