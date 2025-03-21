import java.util.ArrayList;

public class Librarian {
    private final String name;
    private int id;
    private final String password;

    private final ArrayList<Book> books; 
    private final ArrayList<Account> accounts;

    public Librarian(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.books = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public boolean verifyLibrarian(String name, String password) {
        return this.name.equals(name) && this.password.equals(password);
    }

    public void searchBook(String title) {
        System.out.println("Searching for book: " + title);
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                book.displayBookDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the library.");
        }
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to the library.");
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book '" + book.getTitle() + "' removed from the library.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in the library.");
        }
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    public void displayAllAccounts() {
        System.out.println("Displaying all accounts:");
        for (Account account : accounts) {
            account.displayAccount();
        }
    }

    public void lendBookToAccount(Account account, Book book) {
        if (books.contains(book)) {
            account.borrowBook(book);
            account.countBorrowedBooks();
            books.remove(book);
            System.out.println("Book '" + book.getTitle() + "' has been lent to the account.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available.");
        }
    }

    public void displayBooks() {
        System.out.println("Available Books in the Library:");
        for (Book book : books) {
            book.displayBookDetails();
            System.out.println();
        }
    }
}
