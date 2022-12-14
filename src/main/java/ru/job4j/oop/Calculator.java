package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(10);
        System.out.println(resultSum);
        System.out.println(" ");
        int resultMinus = Calculator.minus(20);
        System.out.println(resultMinus);
        System.out.println(" ");
        Calculator calculator = new Calculator();
        int resultDiv = calculator.divide(25);
        System.out.println(resultDiv);
        System.out.println(" ");
        int resultMultiply = calculator.multiply(10);
        System.out.println(resultMultiply);
        System.out.println(" ");
        int resultAll = calculator.sumAllOperation(10);
        System.out.println(resultAll);
    }
}