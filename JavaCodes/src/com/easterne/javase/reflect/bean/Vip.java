package com.easterne.javase.reflect.bean;

public class Vip {
    private String name;
    public int no;
    private String birth;
    private boolean sex;

    public Vip() {
    }

    public Vip(String name, int no, String birth, boolean sex) {
        this.name = name;
        this.no = no;
        this.birth = birth;
        this.sex = sex;
    }

    public Vip(String name, int no, String birth) {
        this.name = name;
        this.no = no;
        this.birth = birth;
    }

    public Vip(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public Vip(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", birth='" + birth + '\'' +
                ", sex=" + sex +
                '}';
    }
}
