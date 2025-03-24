import java.util.ArrayList;

public class Book {
    private String bookName;
    private String author;
    private int isbn;
    private int year;
    static ArrayList<Book> books = new ArrayList<>();

        public Book() {
            bookName = "";
            author = "";   
            isbn = 0;
            year = 0;
        }   

        Book(String bookName, String author, int isbn, int year) {
            this.bookName = bookName;
            this.author = author;
            this.isbn = isbn;
            this.year = year;
            
        }
    
        public String getBookName() {
            return this.bookName;
        }   
    
        public String getAuthor() {
            return this.author;
        }
    
        public int getIsbn() {
            return this.isbn;
        }
    
        public int getYear() {
            return this.year;
        }
    
        public void setBookName(String bookName) {
            this.bookName = bookName;
        }
    
        public void setAuthor(String author) {
            this.author = author;
        }
    
        public void setIsbn(int isbn) {
            this.isbn = isbn;
        }
    
        public void setYear(int year) {
            this.year = year;
        }
    
        public static void add(Book book) {
            books.add(book);
        }
    
        public static void display() {
            for(Book book : books) {
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Year: " + book.getYear());
        }
    }

}
