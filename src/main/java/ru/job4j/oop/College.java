package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Student stu = new Student();
        Freshman fresh = (Freshman) stu;
        Object ob = stu;
        Object obj = fresh;
    }
}
