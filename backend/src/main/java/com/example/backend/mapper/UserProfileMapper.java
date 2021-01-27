package com.example.backend.mapper;

import java.util.List;

import com.example.backend.model.UserProfile;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserProfileMapper {

    @Select("SELECT * FROM user_profile WHERE id=#{id}")
    UserProfile getUserProfile(@Param("id") String id);

    @Select("SELECT * FROM user_profile")
    List<UserProfile> getUserProfileList();
}
