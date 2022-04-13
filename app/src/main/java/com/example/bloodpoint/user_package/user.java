package com.example.bloodpoint.user_package;

public class user {
    private String userID;
    private String username;
    private String email;
    private String idNumber;
    private String phoneNumber;
    private String bloodGroup;
    private String type;
    private String group;

    public user(){

    }
    public user( String username, String email, String idNumber, String phoneNumber, String bloodGroup, String type, String group){
//        this.userID = userID;
        this.username = username;
        this.email = email;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.bloodGroup = bloodGroup;
        this.type = type;
        this.group = group;
    }

    //    public String getUserID(){
//        return userID;
//    }
//    public void setUserID(String userID) {
//        this.userID = userID;
//    }
//
    public String getUsername(){
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday(){
        return idNumber;
    }
    public void setBirthday(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBloodGroup(){
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getGroup(){
        return group;
    }
    public void setGroup(String group) {
        this.type = group;
    }
}