package com.kaluka.domain;

import java.util.Date;

public class Sign {
    private Integer uId;
    private Boolean uSign;
    private Date time = new Date();

    @Override
    public String toString() {
        return "Sign{" +
                "uId=" + uId +
                ", uSign=" + uSign +
                ", time=" + time +
                '}';
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Boolean getuSign() {
        return uSign;
    }

    public void setuSign(Boolean uSign) {
        this.uSign = uSign;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Sign(Integer uId, Boolean uSign) {
        this.uId = uId;
        this.uSign = uSign;
    }
}
