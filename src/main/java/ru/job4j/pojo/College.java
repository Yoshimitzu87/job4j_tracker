package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNameSurname("Ivan Ivanov");
        student.setGroup("303A");
        student.setJoined(new Date());

        System.out.println(student.getNameSurname() + " зачислен в группу " + student.getGroup() + " числа: " + student.getJoined());
    }
}
