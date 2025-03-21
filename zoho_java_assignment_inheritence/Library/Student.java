public class Student extends User {
    private String studentClass;

    public Student(String name, int id, String studentClass) {
        super(name, id);
        this.studentClass = studentClass;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public void borrowBook(Account account, Book book) {
        account.borrowBook(book);
        account.countBorrowedBooks();
        System.out.println("Student '" + getUserName() + "' borrowed the book: " + book.getTitle());
    }

    public void returnBook(Account account, Book book) {
        account.countReturnedBooks();
        System.out.println("Student '" + getUserName() + "' returned the book: " + book.getTitle());
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + getUserName());
        System.out.println("Student ID: " + getId());
        System.out.println("Class: " + studentClass);
    }
}
