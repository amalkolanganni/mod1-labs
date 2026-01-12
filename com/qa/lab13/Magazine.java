package com.qa.lab13;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }

    @Override
    public String getDescription() {
        return "Issue #" + issueNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " | Issue: #" + issueNumber;
    }
}
