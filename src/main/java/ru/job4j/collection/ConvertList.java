package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row1 : list) {
            for (int cell : row1) {
                rsl.add(cell);
            }
        }
        return rsl;
    }
}