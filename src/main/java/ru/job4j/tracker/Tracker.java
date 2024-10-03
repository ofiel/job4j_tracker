package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item unit) {
        unit.setId(ids++);
        items[size++] = unit;
        return unit;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item unit = items[index];
            if (unit.getId() == id) {
                rsl = unit;
                break;
            }
        }
        return rsl;
    }
}