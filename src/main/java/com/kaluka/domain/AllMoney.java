package com.kaluka.domain;

public class AllMoney {
    private Integer aId;
    private Integer aMoney;

    @Override
    public String toString() {
        return "AllMoney{" +
                "aId=" + aId +
                ", aMoney=" + aMoney +
                '}';
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getaMoney() {
        return aMoney;
    }

    public void setaMoney(Integer aMoney) {
        this.aMoney = aMoney;
    }

    public AllMoney(Integer aId, Integer aMoney) {
        this.aId = aId;
        this.aMoney = aMoney;
    }

    public AllMoney() {
    }
}
