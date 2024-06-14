/*Create a Java class Book with a parameterized constructor that initializes title, author, and isbn. 
Create an object of this class and print its details.*/
package com.constructor;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book myBook = new Book("Java Programming", "John Doe", "978-0-123456-78-9");
        myBook.displayDetails();
    }
}
