package com.colibear.struct.composite._01;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    List<Item> items;

    public void add(Item item) {
        if (items == null) {
            items = new ArrayList<>();
        }

        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
