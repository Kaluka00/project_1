package com.kaluka.domain;

import java.util.Date;

public class ForMoney {
    private Integer mId;
    private Integer uId;
    private Integer nMoney;
    private Boolean permit;
    private Integer pId;
    private Date time = new Date();

    @Override
    public String toString() {
        return "ForMoney{" +
                "mId=" + mId +
                ", uId=" + uId +
                ", nMoney=" + nMoney +
                ", permit=" + permit +
                ", pId=" + pId +
                ", date=" + time +
                '}';
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getnMoney() {
        return nMoney;
    }

    public void setnMoney(Integer nMoney) {
        this.nMoney = nMoney;
    }

    public Boolean getPermit() {
        return permit;
    }

    public void setPermit(boolean permit) {
        this.permit = permit;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public ForMoney(Integer mId, Integer uId, Integer nMoney, Boolean permit, Integer pId) {
        this.mId = mId;
        this.uId = uId;
        this.nMoney = nMoney;
        this.permit = permit;
        this.pId = pId;
    }

    public ForMoney() {
    }
}
