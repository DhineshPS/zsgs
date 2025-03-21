import java.util.ArrayList;

public class LibraryDatabase {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(String title) {
        int i = 0;
        for(Book book : books) {
            if(book.getTitle().equals(title)) {
                books.remove(i);
                return;
            }
            i++;
        }
        System.out.println("Book not found!");
    }

    public void updateBook(String currTitle, String upTitle, String upAuthor, int upIsbn, String upPublication) {
        for(Book book : books) {
            if(book.getTitle().equals(currTitle)) {
                book.setTitle(upTitle);
                book.setAuthor(upAuthor);
                book.setIsbn(upIsbn);
                book.setPublication(upPublication);
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void displayBooks() {
        for(Book book : books) {
            book.display();
        }
    }

    public void search(String searchTitle) {
        for(Book book : books) {
            if(book.getTitle().equals(searchTitle)) {
                book.display();
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
