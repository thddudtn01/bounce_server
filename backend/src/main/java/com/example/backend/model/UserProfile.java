package com.example.backend.model;

public class UserProfile {
    private String id;
    private String name;
    private String phone;
    private String sex;
    private String blood;
    private String birth;
    private String created;
    private String address;

    public UserProfile(String id, String name, String phone){
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getphone(){
        return phone;
    }
    public String getSex(){
        return sex;
    }
    public String getBlood(){
        return blood;
    }
    public String getbirth(){
        return birth;
    }
    public String getCreated(){
        return created;
    }
    public String getAddress(){
        return address;
    }
}
 