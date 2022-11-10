package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public final class SingleTracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private static SingleTracker tracker = new SingleTracker();

    private SingleTracker (){

    }

    public static SingleTracker tracker(){
        if(tracker == null) {
            tracker = new SingleTracker();
        }
        return tracker;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);

    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (Objects.equals(item.getName(), key)) {
                rsl[count++] = item;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean isID = index != -1;
        if (isID) {
            item.setId(id);
            items[index] = item;
        }
        return isID;
    }

    public boolean delete(int id) {
        int indx = indexOf(id);
        boolean isID = indx != -1;
        if (isID) {
            System.arraycopy(items, indx + 1, items, indx, size - indx - 1);
            items[size - 1] = null;
            size--;
        }
        return isID;
    }
}