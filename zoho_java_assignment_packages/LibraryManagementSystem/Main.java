import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", "ISBN123");
        Book b2 = new Book("The Alchemist", "Paulo Coelho", "ISBN456");

        Member m1 = new Member("Alice", 1);
        Member m2 = new Member("Bob", 2);

        System.out.println("\n--- Book List ---");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\n--- Transactions ---");
        Transaction.issueBook(b1, m1);
        Transaction.issueBook(b1, m2);  // Already issued

        Transaction.returnBook(b1, m1);
        Transaction.issueBook(b1, m2);  // Now available

        System.out.println("\n--- Final Book Status ---");
        System.out.println(b1);
        System.out.println(b2);
    }
}
