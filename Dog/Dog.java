package com.cm.homework;

class Dog {
    private String name;
    private String variety;
    private int years;
    private String hobby;

    public Dog(){}

    public Dog(String name, String variety, int years, String hobby) {
        this.name = name;
        this.variety = variety;
        this.years = years;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String toString() {
        return  "小狗名称：" + name + "\n" +
                "品种：" + variety + "\n" +
                "小狗年龄：" + years + "\n"+
                "小狗爱好：" + hobby;
    }
}
