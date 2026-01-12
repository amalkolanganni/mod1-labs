package com.qa.lab13;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem newItem) {
        for (LibraryItem item : items) {
            if (item.getId() == newItem.getId()) {
                System.out.println("Error: Cannot add item. ID " + newItem.getId() + " already exists.");
                return;
            }
        }
        items.add(newItem);
        System.out.println("Added: " + newItem.getTitle());
    }

    public void borrowItem(int id, User user) {
        try {
            LibraryItem item = findItemById(id);
            
            user.addBorrowedItem(item);
            
            item.borrowItem();
            
            System.out.println("Success: " + user.getName() + " borrowed '" + item.getTitle() + "'");

        } catch (LibraryException e) {
            System.out.println("Borrow Failed: " + e.getMessage());
        }
    }

    public void returnItem(int id, User user) {
        try {
            LibraryItem item = findItemById(id);
            
            item.returnItem();
            user.removeBorrowedItem(item);
            
            System.out.println("Success: '" + item.getTitle() + "' returned.");

        } catch (LibraryException e) {
            System.out.println("Return Failed: " + e.getMessage());
        }
    }

    private LibraryItem findItemById(int id) throws LibraryException {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        throw new LibraryException("Item with ID " + id + " not found.");
    }

    public void listAvailableItems() {
        System.out.println("\n--- Available Items ---");
        for (LibraryItem item : items) {
            if (!item.isBorrowed()) {
                System.out.println(item);
            }
        }
    }
}
