import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static LMS lms = new LMS();

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
        lms.librarianAddBook(book1);
        lms.librarianAddBook(book2);
        lms.librarianAddBook(book3);
    }

    private static void librarianMenu() {
        System.out.print("Enter Librarian Name: ");
        String librarianName = scanner.next();
        System.out.print("Enter Librarian Password: ");
        String librarianPassword = scanner.next();
        if (lms.login(librarianName, librarianPassword)) {
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
                        lms.librarianAddBook(newBook);
                        break;
                    case 2:
                        System.out.print("Enter Book Title to Remove: ");
                        String removeTitle = scanner.next();
                        lms.librarianRemoveBook(removeTitle);
                        break;
                    case 3:
                        System.out.print("Enter Book Title to Search: ");
                        String searchTitle = scanner.next();
                        lms.librarianSearchBook(searchTitle);
                        break;
                    case 4:
                        lms.librarianDisplayBooks();
                        break;
                    case 5:
                        lms.logout();
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
        if (lms.register(studentName, "password", "password")) {
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
                        lms.userBorrowBook(studentAccount, borrowTitle);
                        break;
                    case 2:
                        System.out.print("Enter Book Title to Return: ");
                        String returnTitle = scanner.next();
                        lms.userReturnBook(studentAccount, new Book(returnTitle, "", 0));
                        break;
                    case 3:
                        lms.userDisplayAccountDetails(studentAccount);
                        break;
                    case 4:
                        lms.logout();
                        return;
                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        }
    }

    private static void staffMenu() {
        System.out.print("Enter Staff Name: ");
        String staffName = scanner.next();
        System.out.print("Enter Staff ID: ");
        int staffId = scanner.nextInt();
        if (lms.register(staffName, "password", "password")) {
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
                        lms.userBorrowBook(staffAccount, borrowTitle);
                        break;
                    case 2:
                        System.out.print("Enter Book Title to Return: ");
                        String returnTitle = scanner.next();
                        lms.userReturnBook(staffAccount, new Book(returnTitle, "", 0));
                        break;
                    case 3:
                        System.out.print("Enter Book Title to Mark as Lost: ");
                        String lostTitle = scanner.next();
                        staffAccount.markBookAsLost(new Book(lostTitle, "", 0));
                        break;
                    case 4:
                        lms.userDisplayAccountDetails(staffAccount);
                        break;
                    case 5:
                        lms.logout();
                        return;
                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        }
    }
}
