package com.cm.homework;

import java.util.Scanner;

public class GetCy {
            //定义父类--园类
    //定义主类

        public static void main(String[] args){     //主程入口
            Scanner sc = new Scanner(System.in);
            double r = sc.nextInt();
            double h = sc.nextDouble();
            if(r <= 0 || h <= 0){
                System.out.println("input error");
            }else{
                Circle Ci=new Circle(r);    //生成园类实例

                Cylinder Cyl=new Cylinder(r,h); //生成园类实例

                Cyl.showVol();   //调用子类方法
            }

        }

    }


