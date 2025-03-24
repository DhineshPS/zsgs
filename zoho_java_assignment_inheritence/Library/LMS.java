import java.util.ArrayList;

public class LMS {
    private String userType; 
    private String userName;
    private String password;

    static private ArrayList<User> users; 
    static private Librarian librarian;
    static private LibraryDatabase libraryDatabase; 

    LMS() {
        users = new ArrayList<>();
        libraryDatabase = new LibraryDatabase();
    }

    public void setLibrarian(Librarian librarian) {
        LMS.librarian = librarian;
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User '" + user.getUserName() + "' added successfully.");
    }

    public boolean login(String userName, String password) {
        if (this.userName == null && this.password == null) {
            System.out.println("Not registered!");
            return false;
        }
        return this.userName.equals(userName) && this.password.equals(password);
    }

    public boolean register(String userName, String password, String confirmPassword) {
        if (this.userName == null && this.password == null) {
            if (password.equals(confirmPassword)) {
                this.userName = userName;
                this.password = password;
                System.out.println("Registration successful!");
                return true;
            } else {
                System.out.println("Password and Confirm password mismatched!");
                return false;
            }
        }
        System.out.println("Already registered!");
        return false;
    }

    public void logout() {
        System.out.println("Logging out!!!");
    }

    public void librarianAddBook(Book book) {
        if (librarian != null) {
            librarian.addBook(book);
            libraryDatabase.addBook(book);
        } else {
            System.out.println("No librarian is set for the system.");
        }
    }

    public void librarianRemoveBook(String title) {
        if (librarian != null) {
            Book bookToRemove = null;
            for (Book book : libraryDatabase.getBooks()) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    bookToRemove = book;
                    break;
                }
            }
            if (bookToRemove != null) {
                librarian.removeBook(bookToRemove);
                libraryDatabase.deleteBook(title);
            } else {
                System.out.println("Book not found in the database.");
            }
        } else {
            System.out.println("No librarian is set for the system.");
        }
    }

    public void librarianDisplayBooks() {
        if (librarian != null) {
            librarian.displayBooks();
        } else {
            System.out.println("No librarian is set for the system.");
        }
    }

    public void librarianSearchBook(String title) {
        if (librarian != null) {
            librarian.searchBook(title);
        } else {
            System.out.println("No librarian is set for the system.");
        }
    }

    public void librarianAddAccount(Account account) {
        if (librarian != null) {
            librarian.addAccount(account);
        } else {
            System.out.println("No librarian is set for the system.");
        }
    }

    public void librarianDisplayAccounts() {
        if (librarian != null) {
            librarian.displayAllAccounts();
        } else {
            System.out.println("No librarian is set for the system.");
        }
    }

    public void userBorrowBook(Account account, String title) {
        Book bookToBorrow = null;
        for (Book book : libraryDatabase.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookToBorrow = book;
                break;
            }
        }
        if (bookToBorrow != null) {
            account.borrowBook(bookToBorrow);
            account.countBorrowedBooks();
            libraryDatabase.deleteBook(title);
            System.out.println("Book '" + title + "' borrowed successfully.");
        } else {
            System.out.println("Book not available in the library.");
        }
    }

    public void userReturnBook(Account account, Book book) {
        account.countReturnedBooks();
        libraryDatabase.addBook(book);
        System.out.println("Book '" + book.getTitle() + "' returned successfully.");
    }

    public void userDisplayAccountDetails(Account account) {
        account.displayAccount();
    }

    public void userDisplayBorrowedBooks(Account account) {
        account.displayBooks();
    }
}
