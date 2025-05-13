package OOPJ.inheritance.classes;

public class EBook extends Book{
    public int fileSize;
    public String downloadUrl;

    public EBook(int fileSize, String downloadUrl) {
        this.fileSize = fileSize;
        this.downloadUrl = downloadUrl;
    }

    public EBook(String title, String author, String ISBN, int fileSize, String downloadUrl) {
        super(title, author, ISBN);
        this.fileSize = fileSize;
        this.downloadUrl = downloadUrl;
    }

    public void EBookDetails() {
        System.out.println("fileSize: " + fileSize + ", downloadUrl: " + downloadUrl);
    }

    public void getDetails() {
        EBookDetails();
        BookDetails();
    }
}
