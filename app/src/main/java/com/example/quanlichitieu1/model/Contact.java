package com.example.quanlichitieu1.model;

public class Contact {
    private String mTien;
    private String mHangMuc,mTime;
    private int mViTriHangMuc;

    public Contact(String mTien, String mHangMuc, String mTime, int mViTriHangMuc) {
        this.mTien = mTien;
        this.mHangMuc = mHangMuc;
        this.mTime = mTime;
        this.mViTriHangMuc = mViTriHangMuc;
    }

    public String getmTien() {
        return mTien;
    }

    public void setmTien(String mTien) {
        this.mTien = mTien;
    }

    public String getmHangMuc() {
        return mHangMuc;
    }

    public void setmHangMuc(String mHangMuc) {
        this.mHangMuc = mHangMuc;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public int getmViTriHangMuc() {
        return mViTriHangMuc;
    }

    public void setmViTriHangMuc(int mViTriHangMuc) {
        this.mViTriHangMuc = mViTriHangMuc;
    }
}
