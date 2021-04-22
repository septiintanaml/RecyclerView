package com.example.project5;

public class Hero {
    private  String title;
    private String detail;
    private int photo;

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title= name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
