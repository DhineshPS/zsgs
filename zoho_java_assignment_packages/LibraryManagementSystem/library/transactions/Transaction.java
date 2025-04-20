package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {

    public static void issueBook(Book book, Member member) {
        if (!book.isIssued()) {
            book.issueBook();
            System.out.println("Issued \"" + book.getTitle() + "\" to " + member.getName());
        } else {
            System.out.println("Sorry! \"" + book.getTitle() + "\" is already issued.");
        }
    }

    public static void returnBook(Book book, Member member) {
        if (book.isIssued()) {
            book.returnBook();
            System.out.println(member.getName() + " returned \"" + book.getTitle() + "\"");
        } else {
            System.out.println("\"" + book.getTitle() + "\" is not issued.");
        }
    }
}
