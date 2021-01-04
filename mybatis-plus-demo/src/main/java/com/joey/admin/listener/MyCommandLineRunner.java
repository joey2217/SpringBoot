package com.joey.admin.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 应用启动做一个一次性事情
 * @author EDZ
 * // @Component
 */
public class MyCommandLineRunner implements CommandLineRunner {
    @Value("${app.static-path-prefix}")
    private String staticPathPrefix;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("########MyCommandLineRunner....run....###########"+staticPathPrefix);
    }
}
