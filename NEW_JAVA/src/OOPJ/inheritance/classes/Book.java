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

    public void BookDetails() {
        System.out.println("title: " + title + ", author: " + author + ", ISBN: " + ISBN);
    }
}
