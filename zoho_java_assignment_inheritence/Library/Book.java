import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private String publication;
    private int dueDate;
    private boolean reservationStatus;
    
    ArrayList<String> feedback = new ArrayList<>();

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public String getPublication() {
        return this.publication;
    }

    public int getDuedate() {
        return this.dueDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public void display() {
        System.out.println("Book Title : " + this.title);
        System.out.println("Book Author : " + this.author);
        System.out.println("Book ISBN : " + this.isbn);
        System.out.println("Book publication : " + this.publication);
        System.out.println();
    }

    public int showDueDate() {
        return getDuedate();
    }

    void reservationStatus(boolean status) {
        this.reservationStatus = status;
    }

    void feedback(String fb) {
        feedback.add(fb);
    }

    void bookRequest() {
        if(!reservationStatus) {
            reservationStatus = true;
        }
    }

    void renewInfo(int renewDate) {
        this.dueDate += renewDate;
    }
}
