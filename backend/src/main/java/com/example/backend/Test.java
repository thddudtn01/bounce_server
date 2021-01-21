package com.example.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/vscode")
public class Test {
    @GetMapping(value = {"", "/"})
    public String enter(){
        return "yssong test";
    }
}
