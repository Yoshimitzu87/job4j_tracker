package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row1 : array) {
            for (int cell : row1) {
                list.add(cell);
            }
        }
        return list;
    }
}