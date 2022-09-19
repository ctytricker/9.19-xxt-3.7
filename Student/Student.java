package com.cm.homework;

import java.util.Objects;

class Student {
    private int sno;
    private String sname;
    private String sex;
    private int hight;
    private String birthDate;

    public  Student(){

    }

    public Student(int sno, String sname, String sex, int hight, String birthDate) {
        this.sno = sno;
        this.sname = sname;
        this.sex = sex;
        this.hight = hight;
        this.birthDate = birthDate;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        if(Objects.equals(this.sex, "m")){
            return "Student["  + sno +
                    "," + sname +
                    "," + "男" +
                    "," + hight +
                    "," + birthDate +
                    ']';
        }
        return "Student["  + sno +
                "," + sname +
                "," + "女" +
                "," + hight +
                "," + birthDate +
                ']';

    }
}
