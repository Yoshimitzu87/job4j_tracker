package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {
    @Test
    public void whenSortedAscByName() {
        List<Item> items = Arrays.asList(
                new Item(3, "Ivan"),
                new Item(1, "Petr"),
                new Item(2, "Anton")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "Anton"),
                new Item(3, "Ivan"),
                new Item(1, "Petr")
        );
        assertThat(expected).isEqualTo(items);
    }

    @Test
    public void whenSortedDescByName() {
        List<Item> items = Arrays.asList(
                new Item(3, "Anton"),
                new Item(1, "Ivan"),
                new Item(2, "Petr")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "Petr"),
                new Item(1, "Ivan"),
                new Item(3, "Anton")
        );
        assertThat(expected).isEqualTo(items);
    }
}