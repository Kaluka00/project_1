package com.kaluka.domain;

public class TUser {
    private Integer uId;
    private Integer years;
    private Integer birth;
    private String eMail;
    private Integer hPeople;
    private String mPhone;

    public TUser() {
    }

    public TUser(Integer uId, Integer years, Integer birth, String eMail, Integer hPeople, String mPhone) {
        this.uId = uId;
        this.years = years;
        this.birth = birth;
        this.eMail = eMail;
        this.hPeople = hPeople;
        this.mPhone = mPhone;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Integer getBirth() {
        return birth;
    }

    public void setBirth(Integer birth) {
        this.birth = birth;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer gethPeople() {
        return hPeople;
    }

    public void sethPeople(Integer hPeople) {
        this.hPeople = hPeople;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "uId=" + uId +
                ", years=" + years +
                ", birth=" + birth +
                ", eMail='" + eMail + '\'' +
                ", hPeople=" + hPeople +
                ", mPhone=" + mPhone +
                '}';
    }
}
