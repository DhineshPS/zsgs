public class Staff extends User {
    private String dept;

    public Staff(String name, int id, String dept) {
        super(name, id);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void borrowBook(Account account, Book book) {
        account.borrowBook(book);
        account.countBorrowedBooks();
        System.out.println("Staff '" + getUserName() + "' borrowed the book: " + book.getTitle());
    }

    public void returnBook(Account account, Book book) {
        account.countReturnedBooks();
        System.out.println("Staff '" + getUserName() + "' returned the book: " + book.getTitle());
    }

    public void displayStaffDetails() {
        System.out.println("Staff Name: " + getUserName());
        System.out.println("Staff ID: " + getId());
        System.out.println("Department: " + dept);
    }
}
