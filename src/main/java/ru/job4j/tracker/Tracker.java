package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        if(index != -1){
            return items.get(index);
        }
        return null;
    }

    public List<Item> findAll() {
        return List.copyOf(items);

    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            Item item = items.get(index);
            if (Objects.equals(item.getName(), key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean isID = index != -1;
        if (isID) {
            items.set(index, item);
            item.setId(id);
        }
        return isID;
    }

    public boolean delete(int id) {
        int indx = indexOf(id);
        boolean isID = indx != -1;
        if (isID) {
            items.remove(indx);
        }
        return isID;
    }
}