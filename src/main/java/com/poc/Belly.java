package com.poc;

public class Belly {
    private int cookie;
    private int hour;

    public void eat(String text) {
        System.out.print(text +": "+ this.calc());
    }

    public int calc(){
        return this.getCookie() * this.getHour();
    }

    public int getCookie() {
        return cookie;
    }

    public void setCookie(int cookie) {
        this.cookie = cookie;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
