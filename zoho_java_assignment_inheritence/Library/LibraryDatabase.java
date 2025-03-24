import java.util.ArrayList;

public class LibraryDatabase {
    private final ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to the database.");
    }

    public void deleteBook(String title) {
        int i = 0;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(i);
                System.out.println("Book '" + title + "' removed from the database.");
                return;
            }
            i++;
        }
        System.out.println("Book '" + title + "' not found!");
    }

    public void updateBook(String currTitle, String upTitle, String upAuthor, int upIsbn, String upPublication) {
        for (Book book : books) {
            if (book.getTitle().equals(currTitle)) {
                book.setTitle(upTitle);
                book.setAuthor(upAuthor);
                book.setIsbn(upIsbn);
                book.setPublication(upPublication);
                System.out.println("Book '" + currTitle + "' updated successfully.");
                return;
            }
        }
        System.out.println("Book '" + currTitle + "' not found!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the database.");
            return;
        }
        System.out.println("Books in the database:");
        for (Book book : books) {
            book.displayBookDetails();
            System.out.println();
        }
    }

    public void search(String searchTitle) {
        for (Book book : books) {
            if (book.getTitle().equals(searchTitle)) {
                book.displayBookDetails();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
