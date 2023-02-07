package ru.job4j.hmap;

public class Main {

    public static void main(String[] args) {

        int[] nums = {2, 3, 4};

        int result = 0;

        for (int m : nums) {

            result += m;

        }

        System.out.println("Значение среднего арифметического равно: " + result / nums.length);

    }

}

