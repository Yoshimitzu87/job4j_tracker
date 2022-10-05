package ru.job4j.oop;

public class Error {

    private boolean firstError;
    private int secondError;
    private String thirdError;

    public Error(boolean firstError, int secondError, String thirdError) {
        this.firstError = firstError;
        this.secondError = secondError;
        this.thirdError = thirdError;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("ПерваяОшибка: " + firstError);
        System.out.println("ВтораяОшибка: " + secondError);
        System.out.println("ТретьяОшибка: " + thirdError);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 3, "asdasd");
        error.printInfo();
        System.out.println(" ");
        Error errorOne = new Error();
        errorOne.printInfo();
        System.out.println(" ");
        Error errorTwo = new Error(false, 22, "asasd");
        errorTwo.printInfo();
    }
}





