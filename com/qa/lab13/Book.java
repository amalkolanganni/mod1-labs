package com.qa.lab13;

public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(int id, String title, String author, int pages) {
        super(id, title);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getDescription() {
        return "Written by " + author + ", " + pages + " pages.";
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Author: " + author;
    }
}
