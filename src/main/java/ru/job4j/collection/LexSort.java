package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftC = left.split(". ");
        String[] rightC = right.split(". ");
        return Integer.compare(Integer.parseInt(leftC[0]), Integer.parseInt(rightC[0]));
    }
}
