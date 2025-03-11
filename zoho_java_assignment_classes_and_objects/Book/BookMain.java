public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookName("The Alchemist");
        book1.setAuthor("Paulo Coelho");
        book1.setIsbn(123456);
        book1.setYear(1988);
        Book.add(book1);

        Book book2 = new Book();
        book2.setBookName("The Da Vinci Code");
        book2.setAuthor("Dan Brown");
        book2.setIsbn(123457);
        book2.setYear(2003);
        Book.add(book2);

        Book book3 = new Book();
        book3.setBookName("The Kite Runner");
        book3.setAuthor("Khaled Hosseini");
        book3.setIsbn(123458);
        book3.setYear(2003);
        Book.add(book3);

        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 123459, 1925);
        Book.add(book4);
        
        Book.display();
    }
}
