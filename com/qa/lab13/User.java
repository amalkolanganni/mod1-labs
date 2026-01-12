package com.qa.lab13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<LibraryItem> borrowedItems;
    private static final int MAX_BORROW_LIMIT = 3;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    public void addBorrowedItem(LibraryItem item) throws LibraryException {
        if (borrowedItems.size() >= MAX_BORROW_LIMIT) {
            throw new LibraryException("User " + name + " has reached the borrow limit of " + MAX_BORROW_LIMIT);
        }
        borrowedItems.add(item);
    }

    public void removeBorrowedItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    public String getName() { return name; }
    
    public void printBorrowedItems() {
        System.out.println(name + "'s items:");
        for(LibraryItem item : borrowedItems) {
            System.out.println(" - " + item.getTitle());
        }
    }
}
