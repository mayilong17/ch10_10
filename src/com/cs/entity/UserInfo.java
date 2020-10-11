package com.cs.entity;

public class UserInfo {
    private int userID;
    private String userName;
    private String userPass;
    private String sex;
    private int age;
    private String email;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserInfo() {
    }

    public UserInfo(int userID, String userName, String userPass, String sex, int age, String email) {
        this.userID = userID;
        this.userName = userName;
        this.userPass = userPass;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
