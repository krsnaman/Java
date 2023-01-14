package com.company;
class Library {
    String[] availableBooks;
    int numOfAvailableBooks;
    Library() {
        availableBooks = new String[100];
        numOfAvailableBooks = 0;
    }
    void addBook(String book) {
        this.availableBooks[this.numOfAvailableBooks] = book;
        this.numOfAvailableBooks++;
        System.out.println(book + " has been added in the library.");
    }

    void showAvailableBooks() {
        System.out.println("Available books in the library are:");
        for(String book: this.availableBooks) {
            if(book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for(int i=0; i<availableBooks.length; i++) {
            String b = availableBooks[i];
            if(b != null && b.equals(book)) {
                availableBooks[i] = null;
                System.out.println(b + " has been issued from the library.");
                return;
            }
        }
        System.out.println(book + " is not available in the library.");
    }

    void returnBook(String book) {
        System.out.println(book + " is being returned to the library.");
        this.addBook(book);
    }

}
public class cwh_51_exercise4 {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Think and Grow Rich");
        library.addBook("Java");
        library.addBook("Hibernate");
        library.addBook("SpringBoot");

        library.showAvailableBooks();

        library.issueBook("Think and Grow Rich");
        library.showAvailableBooks();
        library.issueBook("SpringBoot");
        library.showAvailableBooks();
        library.returnBook("SpringBoot");
        library.showAvailableBooks();
        library.issueBook("Think and Grow Rich");
    }
}
