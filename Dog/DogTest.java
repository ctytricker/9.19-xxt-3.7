package com.cm.homework;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tom","哈士奇",2,"拆家");
        Dog d2 = new Dog("jerry","中华田园犬",3,"护家");
        Dog d3 = new Dog("旺财","柯基",2,"吃喝玩");
        Dog[] dog = new Dog[3];
        dog[0] = d1;
        dog[1] = d2;
        dog[2] = d3;
        for(int i = 0;i < dog.length;i++){
            System.out.println(dog[i]);
        }
    }
}
