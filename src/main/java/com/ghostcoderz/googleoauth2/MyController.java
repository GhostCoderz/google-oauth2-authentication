package com.ghostcoderz.googleoauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String home(){
        return "<h1>Hi! You have successfully logged in.</h1>" +
                "<br>" +
                "Try going to restricted url : <a href='/restricted'>Restricted Page</a>";
    }

    @GetMapping("restricted")
    public String restricted(){
        return "<h1>This is a restricted page. Only " +
                "authenticated users can open</h1>";
    }

}
