package com.kaluka.domain;

public class Money {
    private Integer uId;
    private Integer uMoney;

    @Override
    public String toString() {
        return "Money{" +
                "uId=" + uId +
                ", uMoney=" + uMoney +
                '}';
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getuMoney() {
        return uMoney;
    }

    public void setuMoney(Integer uMoney) {
        this.uMoney = uMoney;
    }

    public Money(Integer uId, Integer uMoney) {
        this.uId = uId;
        this.uMoney = uMoney;
    }

    public Money() {
    }
}
