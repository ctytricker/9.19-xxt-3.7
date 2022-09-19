package com.cm.homework;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        s.setSno(sc.nextInt());
        s.setSname(sc.next());
        s.setSex(String.valueOf(sc.next().charAt(0)));
        s.setHight(sc.nextInt());
        s.setBirthDate(sc.next());

        System.out.print(s);

    }
}
