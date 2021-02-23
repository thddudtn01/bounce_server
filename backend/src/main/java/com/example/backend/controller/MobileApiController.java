package com.example.backend.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileApiController {
    @GetMapping("/mobile/{id}/{ekg}")
    public HashMap hello(@PathVariable("id") String id, @PathVariable("ekg") String ekg) {
        HashMap result = new HashMap();
        System.out.println(id + "/" + ekg);
        result.put("message", "hello");

        return result;
    }

    @GetMapping("/mobile/mobile")
    public HashMap mobile() {
        HashMap result = new HashMap();
        result.put("message", "모바일입니다.");

        return result;
    }
}
