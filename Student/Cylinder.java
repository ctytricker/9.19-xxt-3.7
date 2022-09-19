package com.cm.homework;

class Cylinder extends Circle {
    //定义子类--圆柱类

    private double hight;             //成员变量--圆柱高

    Cylinder(double r, double hight) {    //构造方法

        super(r);

        this.hight = hight;

    }

    public double getVol() {

        return getArea() * hight;

    }

    public void showVol() {

        System.out.printf("%.2f" , getVol());

    }

}

