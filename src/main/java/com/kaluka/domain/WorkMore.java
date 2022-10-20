package com.kaluka.domain;

public class WorkMore {
    private int uId;
    private int count;
    private boolean workMore;

    @Override
    public String toString() {
        return "WorkMore{" +
                "uId=" + uId +
                ", count=" + count +
                ", workMore=" + workMore +
                '}';
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isWorkMore() {
        return workMore;
    }

    public void setWorkMore(boolean workMore) {
        this.workMore = workMore;
    }

    public WorkMore(int uId, int count, boolean workMore) {
        this.uId = uId;
        this.count = count;
        this.workMore = workMore;
    }

    public WorkMore() {
    }
}