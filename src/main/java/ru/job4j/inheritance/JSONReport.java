package ru.job4j.inheritance;

public class JSONReport {
    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        char ch = '"';

        return "{" + ln
                + "\t\"name\" : " + ch + name + ch + "," + ln
                + "\t\"body\" : " + '"' + body + '"' + ln
                + "}";

    }
}