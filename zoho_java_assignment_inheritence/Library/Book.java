import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int duedate;
    private int isbn;
    private String publication;
    private boolean reservationStatus;
    
    ArrayList<String> feedback = new ArrayList<>();

    public Book(String title, String author, int duedate) {
        this.title = title;
        this.author = author;
        this.duedate = duedate;
    }

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
        return this.duedate;
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
        this.duedate = dueDate;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Due Date (days overdue): " + this.duedate);
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
        this.duedate += renewDate;
    }
}
