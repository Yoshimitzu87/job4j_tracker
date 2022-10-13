package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book war = new Book("War & Peace", 900);
        Book clean = new Book("Clean code", 400);
        Book head = new Book("Head First : Java", 750);
        Book art = new Book("Xin Ci The Art of War", 844);
        Book[] books = new Book[4];
        books[0] = war;
        books[1] = clean;
        books[2] = head;
        books[3] = art;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPgs());
        }
        System.out.println("switch 0 to 3");
        books[0] = head;
        books[2] = war;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPgs());
        }
        System.out.println("Show only Clean code");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code"))
                System.out.println(bk.getName() + " - " + bk.getPgs());
        }
    }
}
