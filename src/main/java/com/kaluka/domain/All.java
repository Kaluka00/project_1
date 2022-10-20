package com.kaluka.domain;

public class All {
    private Integer uId;
    private String uName;
    private String uPassword;
    private String uGrade;
    private Money money;
    private Sign sign;
    private WorkMore workMore;
    private TUser tUser;

    public All() {
    }

    @Override
    public String toString() {
        return "All{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uGrade='" + uGrade + '\'' +
                ", money=" + money +
                ", sign=" + sign +
                ", workMore=" + workMore +
                ", tUser=" + tUser +
                '}';
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

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public WorkMore getWorkMore() {
        return workMore;
    }

    public void setWorkMore(WorkMore workMore) {
        this.workMore = workMore;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }

    public All(Integer uId, String uName, String uPassword, String uGrade, Money money, Sign sign, WorkMore workMore, TUser tUser) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uGrade = uGrade;
        this.money = money;
        this.sign = sign;
        this.workMore = workMore;
        this.tUser = tUser;
    }
}