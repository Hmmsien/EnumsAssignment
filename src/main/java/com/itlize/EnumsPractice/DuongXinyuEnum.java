package com.itlize.EnumsPractice;

enum DuongXinyuEnum {
    //enum fields
    Duong("Duong"), Xinyu("Xinyu");

    //instance variables;
    private final String name;

    DuongXinyuEnum(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return "Hey, my name is " + this.name() + "!";
    }

    public boolean isDuong() {
        return this==Duong;
    }

    public boolean isXinyu() {
        return this==Xinyu;
    }

}




