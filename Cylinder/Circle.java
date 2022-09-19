package com.cm.homework;

class Circle {
    private double radius;     //成员变量--圆半径

    Circle(){
    }
    Circle(double radius){    //构造方法
        this.radius = radius;
    }

    double getArea(){    //成员方法--求圆面积
        return Math.PI * radius * radius;
    }
}
