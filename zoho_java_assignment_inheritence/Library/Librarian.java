public class Librarian {
    private String name;
    private int id;
    private String password;
    private String searchString;

    LibraryDatabase ldb = new LibraryDatabase();

    Librarian(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public boolean verifyLibrarian(String name, String password) {
        return this.name.equals(name) && this.password.equals(password);
    }

    public void search(String title) {
        ldb.search(title);
    }
}
