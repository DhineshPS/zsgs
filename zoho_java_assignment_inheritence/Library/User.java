public class User {
    private String name;
    private int id;
    private final Account acc = new Account();
    private boolean loginStatus;
    User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void verify() {
        
    }

    public void checkAccount() {
        acc.displayAccount();
    }

    public void getBookInfo() {
        acc.displayBooks();
    }
}
