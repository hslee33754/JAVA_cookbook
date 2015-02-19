package com.hlee.CookBook;

public interface ManageItems {
    void add(Item i);
    void edit(Item i);
    void remove(Item i);
    Item getItem(String name); // this make any classes inherited from Item works for above methods that are passing Item.
}