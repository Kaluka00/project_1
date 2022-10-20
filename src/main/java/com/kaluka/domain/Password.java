package com.kaluka.domain;

public class Password {
    private Integer uId;
    private String uPassword;

    public Password() {
    }

    @Override
    public String toString() {
        return "Password{" +
                "uId=" + uId +
                ", uPassword='" + uPassword + '\'' +
                '}';
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Password(Integer uId, String uPassword) {
        this.uId = uId;
        this.uPassword = uPassword;
    }
}
