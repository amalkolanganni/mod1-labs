package com.qa.lab13;

public abstract class LibraryItem {
    private int id;
    private String title;
    private boolean isBorrowed;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
    }

    public abstract String getItemType();
    
    public abstract String getDescription();

    public void borrowItem() throws LibraryException {
        if (isBorrowed) {
            throw new LibraryException("Item '" + title + "' is already borrowed.");
        }
        isBorrowed = true;
    }

    public void returnItem() throws LibraryException {
        if (!isBorrowed) {
            throw new LibraryException("Item '" + title + "' is not currently borrowed.");
        }
        isBorrowed = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public boolean isBorrowed() { return isBorrowed; }
    
    @Override
    public String toString() {
        String status = isBorrowed ? "[Borrowed]" : "[Available]";
        return String.format("ID: %d | %s | %s %s", id, getItemType(), title, status);
    }
}
