public class User {
    private String name;
    private int id;
    private final Account acc = new Account(); 
    private boolean loginStatus;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
        this.loginStatus = false;
    }

    public String getUserName() {
        return name;
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public void verify(String enteredName, int enteredId) {
        if (this.name.equals(enteredName) && this.id == enteredId) {
            this.loginStatus = true;
            System.out.println("User verified successfully!");
        } else {
            System.out.println("Verification failed. Invalid credentials.");
        }
    }

    public void checkAccount() {
        acc.displayAccount();
    }

    public void getBookInfo() {
        acc.displayBooks();
    }

    public void borrowBook(Book book) {
        acc.borrowBook(book);
        acc.countBorrowedBooks();
        System.out.println("User '" + name + "' borrowed the book: " + book.getTitle());
    }

    public void returnBook(Book book) {
        acc.countReturnedBooks();
        System.out.println("User '" + name + "' returned the book: " + book.getTitle());
    }

    public void displayUserDetails() {
        System.out.println("User Name: " + name);
        System.out.println("User ID: " + id);
        System.out.println("Login Status: " + (loginStatus ? "Logged In" : "Logged Out"));
    }
}
