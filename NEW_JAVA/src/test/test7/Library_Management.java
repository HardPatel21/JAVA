package test.test7;

import java.util.Scanner;

public class Library_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();
        int choice;

        do {
            System.out.println("1.add book");
            System.out.println("2.update book");
            System.out.println("3.delete book");
            System.out.println("4.view books");
            System.out.println("5.exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author Name: ");
                    String author_name = sc.nextLine();
                    System.out.println("Enter availability status(true / false)");
                    boolean isAvailable = sc.nextBoolean();
                    l.addBook(new Book(id, title, author_name, isAvailable));
                    break;
                case 2:
                    System.out.println("Enter Book id to update: ");
                    int new_id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new book author name: ");
                    String new_bookAuthor = sc.nextLine();
                    System.out.println("Enter new book title: ");
                    String new_bookTitle = sc.nextLine();
                    System.out.println("Enter new availability status (true / false): ");
                    boolean new_status = sc.nextBoolean();
                    l.updateBook(new_id, new_bookTitle, new_bookAuthor, new_status);
                    break;
                case 3:
                    System.out.println("Enter Book id to delete: ");
                    int b_id = sc.nextInt();
                    l.deleteBook(b_id);
                    break;
                case 4:
                    l.showBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter valid choice!");
                    break;
            }
        } while(choice != 5);
        sc.close();
    }
}
