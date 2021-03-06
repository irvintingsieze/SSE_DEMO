package com.sse.file.encryption.controller;

import com.sse.file.encryption.entity.AES_Encrypt;
import com.sse.file.encryption.entity.UserLogin;
import com.sse.file.encryption.service.AES_Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AES_Controller {
    @PostMapping("/aes")
    public AES_Encrypt aes(@RequestBody UserLogin login){
        System.out.println(login.getPassword());
        System.out.println(login.getUsername());
        return AES_Service.main_aes(login.getUsername(),login.getPassword());
    }
}
