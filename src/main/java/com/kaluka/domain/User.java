package com.kaluka.domain;

public class User {
    private Integer uId;
    private String uName;
    private String uPassword;
    private String uGrade;

    public User(Integer uId, String uName, String uPassword, String uGrade) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uGrade = uGrade;
    }

    public User() {
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuGrade() {
        return uGrade;
    }

    public void setuGrade(String uGrade) {
        this.uGrade = uGrade;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uGrade='" + uGrade + '\'' +
                '}';
    }
}
