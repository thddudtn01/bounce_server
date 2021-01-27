package com.example.backend.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import com.example.backend.mapper.UserProfileMapper;
import com.example.backend.model.UserProfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {
    private UserProfileMapper mapper;

    public UserProfileController(UserProfileMapper mapper){
        this.mapper = mapper;
    }

    @GetMapping("/user/{id}")
    public UserProfile getUserProfile(@PathParam("id") String id){
        return mapper.getUserProfile(id);
    }

    @GetMapping("/user/all")
    public List<UserProfile> getUserProfileList(){
        return mapper.getUserProfileList();
    }
}
