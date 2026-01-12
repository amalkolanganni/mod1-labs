package com.qa.lab13;

public class Runner {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addItem(new Book(101, "The Hobbit", "J.R.R. Tolkien", 300));
        lib.addItem(new Book(102, "1984", "George Orwell", 328));
        lib.addItem(new Magazine(201, "Tech Monthly", 55));
        lib.addItem(new Magazine(202, "Nature", 1024));
        
        lib.addItem(new Book(101, "Duplicate Book", "Unknown", 100)); 

        User alice = new User(1, "Alice");

        System.out.println("\n--- Borrowing Phase ---");
        lib.borrowItem(101, alice);
        lib.borrowItem(201, alice);
        lib.borrowItem(101, alice);
        lib.borrowItem(999, alice);

        lib.borrowItem(102, alice);
        lib.borrowItem(202, alice);

        lib.listAvailableItems();
        
        System.out.println("\n--- Return Phase ---");
        lib.returnItem(101, alice);
        lib.listAvailableItems();
    }
}
