/*
5. Library Management System
 Problem Statement:
 Develop a base class `Book` that stores `title`, `author`, and `ISBN`. Derive a class `EBook` that adds `fileSize` and `downloadUrl`. Use single inheritance to display complete information about the book including digital features in the derived class.
*/
package OOPJ.inheritance.classes;

public class Book {
    public String title;
    public String author;
    public String ISBN;

    public Book() {}

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void getBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}
