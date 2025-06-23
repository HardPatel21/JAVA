package test.test7;

public class Library {
    public int bookCount = 0;
    public Book[] books = new Book[100];

//    public Library(int bookId, String title, String author, boolean isAvailable) {
//        super(bookId, title, author, isAvailable);
//    }

    public Library() {}

    public void addBook(Book book) {
        if(bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added successfully.");
        }
        else {
            System.out.println("Book limit reached.");
        }
    }

    public void updateBook(int id, String newTitle, String newAuthor, boolean newAvailabilityStatus) {
        for (int i = 0; i < bookCount; i++) {
            if(books[i].getBookId() == id) {
                books[i].setAuthor(newAuthor);
                books[i].setTitle(newTitle);
                books[i].setAvailable(newAvailabilityStatus);

                System.out.println("Course updated.");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void deleteBook(int id) {
        for (int i = 0; i < bookCount; i++) {
            if(books[i].getBookId() == id) {
                for(int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--bookCount] = null;
                System.out.println("Course deleted.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void showBooks() {
        if(bookCount == 0) {
            System.out.println("No books available");
            return;
        }
        else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }
    }
}


