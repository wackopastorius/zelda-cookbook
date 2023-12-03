package com.lad666.zeldabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.DigestUtils;

@SpringBootApplication
public class ZeldaBackendApplication {

    public static void main(String[] args) {
        byte[] passwordAsBytesArray = "lada".getBytes();
        System.out.println(DigestUtils.md5DigestAsHex(passwordAsBytesArray));
        SpringApplication.run(ZeldaBackendApplication.class, args);
    }

}
