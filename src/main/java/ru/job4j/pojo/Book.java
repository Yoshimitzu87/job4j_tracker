package ru.job4j.pojo;

public class Book {
    private String name;
    private int pgs;

    public Book(String name, int pgs) {
        this.name = name;
        this.pgs = pgs;
    }

    public int getPgs() {
        return pgs;
    }

    public void setPgs(int pgs) {
        this.pgs = pgs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
