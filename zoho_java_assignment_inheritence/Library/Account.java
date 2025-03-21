import java.util.ArrayList;

public class Account {
    private int borrowedBooks;
    private int reservedBooks;
    private int returnedBooks;
    private int lostBooks;
    private double fineAmount;
    ArrayList<Book> userBooks = new ArrayList<>();

    Account() {
        this.borrowedBooks = 0;
        this.reservedBooks = 0;
        this.returnedBooks = 0;
        this.lostBooks = 0;
        this.fineAmount = 0.0;
    }

    public void borrowBook(Book bookTitle) {
        userBooks.add(bookTitle);
        countBorrowedBooks();
        System.out.println("Book '" + bookTitle.getTitle() + "' borrowed successfully.");
    }

    public int getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public int getReservedBooks() {
        return this.reservedBooks;
    }

    public int getReturnedBooks() {
        return this.returnedBooks;
    }

    public int getLostBooks() {
        return this.lostBooks;
    }

    public void countBorrowedBooks() {
        this.borrowedBooks++;
    }

    public void countReservedBooks() {
        this.reservedBooks++;
    }

    public void countReturnedBooks() {
        this.returnedBooks++;
    }

    public void countLostBooks() {
        this.lostBooks++;
    }

    public double calculateFine() {
        fineAmount = 0.0; 
        for (Book book : userBooks) {
            fineAmount += book.getDuedate() * 10; 
        }
        return fineAmount;
    }

    public void displayAccount() {
        System.out.println("Borrowed books: " + this.borrowedBooks);
        System.out.println("Reserved books: " + this.reservedBooks);
        System.out.println("Returned books: " + this.returnedBooks);
        System.out.println("Lost books: " + this.lostBooks);
        System.out.println("Total fine amount: $" + calculateFine());
        System.out.println();
    }

    public void displayBooks() {
        if (userBooks.isEmpty()) {
            System.out.println("No books borrowed.");
            return;
        }
        System.out.println("Books borrowed:");
        for (Book book : userBooks) {
            book.displayBookDetails();
        }
    }

    public void returnBook(Book book) {
        if (userBooks.remove(book)) {
            countReturnedBooks();
            System.out.println("Book '" + book.getTitle() + "' returned successfully.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in borrowed books.");
        }
    }

    public void markBookAsLost(Book book) {
        if (userBooks.remove(book)) {
            countLostBooks();
            System.out.println("Book '" + book.getTitle() + "' marked as lost.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in borrowed books.");
        }
    }
}
