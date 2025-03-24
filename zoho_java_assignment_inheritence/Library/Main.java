import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static LibraryDatabase libraryDatabase = new LibraryDatabase();
    private static Librarian librarian = new Librarian("Alice", 101, "password123");
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Staff> staffMembers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeLibrary();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Librarian Login");
            System.out.println("2. Student Login");
            System.out.println("3. Staff Login");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    librarianMenu();
                    break;
                case 2:
                    studentMenu();
                    break;
                case 3:
                    staffMenu();
                    break;
                case 4:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    private static void initializeLibrary() {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 5);
        Book book2 = new Book("1984", "George Orwell", 0);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 2);
        libraryDatabase.addBook(book1);
        libraryDatabase.addBook(book2);
        libraryDatabase.addBook(book3);
    }

    private static void librarianMenu() {
        System.out.print("Enter Librarian Name: ");
        String librarianName = scanner.next();
        System.out.print("Enter Librarian Password: ");
        String librarianPassword = scanner.next();
        if (librarian.verifyLibrarian(librarianName, librarianPassword)) {
            while (true) {
                System.out.println("\nLibrarian Menu");
                System.out.println("1. Add Book");
                System.out.println("2. Remove Book");
                System.out.println("3. Search Book");
                System.out.println("4. Display All Books");
                System.out.println("5. Logout");
                System.out.print("Enter your choice: ");
                int librarianChoice = scanner.nextInt();

                switch (librarianChoice) {
                    case 1:
                        System.out.print("Enter Book Title: ");
                        String title = scanner.next();
                        System.out.print("Enter Book Author: ");
                        String author = scanner.next();
                        System.out.print("Enter Book Due Days: ");
                        int dueDays = scanner.nextInt();
                        Book newBook = new Book(title, author, dueDays);
                        librarian.addBook(newBook);
                        libraryDatabase.addBook(newBook);
                        break;
                    case 2:
                        System.out.print("Enter Book Title to Remove: ");
                        String removeTitle = scanner.next();
                        librarian.removeBook(new Book(removeTitle, "", 0));
                        libraryDatabase.deleteBook(removeTitle);
                        break;
                    case 3:
                        System.out.print("Enter Book Title to Search: ");
                        String searchTitle = scanner.next();
                        librarian.searchBook(searchTitle);
                        break;
                    case 4:
                        libraryDatabase.displayBooks();
                        break;
                    case 5:
                        System.out.println("Librarian Logged Out.");
                        return;
                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        } else {
            System.out.println("Invalid Librarian Credentials!");
        }
    }

    private static void studentMenu() {
        System.out.print("Enter Student Name: ");
        String studentName = scanner.next();
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        Student student = new Student(studentName, studentId, "10th Grade");
        students.add(student);
        student.verify(studentName, studentId);
        Account studentAccount = new Account();

        while (true) {
            System.out.println("\nStudent Menu");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Display Account Details");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");
            int studentChoice = scanner.nextInt();

            switch (studentChoice) {
                case 1:
                    System.out.print("Enter Book Title to Borrow: ");
                    String borrowTitle = scanner.next();
                    for (Book book : libraryDatabase.getBooks()) {
                        if (book.getTitle().equalsIgnoreCase(borrowTitle)) {
                            student.borrowBook(studentAccount, book);
                            libraryDatabase.deleteBook(borrowTitle);
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter Book Title to Return: ");
                    String returnTitle = scanner.next();
                    student.returnBook(studentAccount, new Book(returnTitle, "", 0));
                    break;
                case 3:
                    studentAccount.displayAccount();
                    break;
                case 4:
                    System.out.println("Student Logged Out.");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    private static void staffMenu() {
        System.out.print("Enter Staff Name: ");
        String staffName = scanner.next();
        System.out.print("Enter Staff ID: ");
        int staffId = scanner.nextInt();
        Staff staff = new Staff(staffName, staffId, "Computer Science");
        staffMembers.add(staff);
        staff.verify(staffName, staffId);
        Account staffAccount = new Account();

        while (true) {
            System.out.println("\nStaff Menu");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Mark Book as Lost");
            System.out.println("4. Display Account Details");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int staffChoice = scanner.nextInt();

            switch (staffChoice) {
                case 1:
                    System.out.print("Enter Book Title to Borrow: ");
                    String borrowTitle = scanner.next();
                    for (Book book : libraryDatabase.getBooks()) {
                        if (book.getTitle().equalsIgnoreCase(borrowTitle)) {
                            staff.borrowBook(staffAccount, book);
                            libraryDatabase.deleteBook(borrowTitle);
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter Book Title to Return: ");
                    String returnTitle = scanner.next();
                    staff.returnBook(staffAccount, new Book(returnTitle, "", 0));
                    break;
                case 3:
                    System.out.print("Enter Book Title to Mark as Lost: ");
                    String lostTitle = scanner.next();
                    staffAccount.markBookAsLost(new Book(lostTitle, "", 0));
                    break;
                case 4:
                    staffAccount.displayAccount();
                    break;
                case 5:
                    System.out.println("Staff Logged Out.");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
