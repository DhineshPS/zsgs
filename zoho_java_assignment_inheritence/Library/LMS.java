import java.util.ArrayList;

public class LMS {
    private String userType;
    private String userName;
    private String password;

    static private ArrayList<User> users;

    static private Librarian librarian;

    LMS() {
        users = new ArrayList<>();
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public boolean login(String userName, String password) {
        if(this.userName == null && this.password == null) {
            System.out.println("Not registered!");
            return false;
        }
        return this.userName.equals(userName) && this.password.equals(password);
    }

    public boolean register(String userName, String password, String confirmPassword) {
        if(this.userName == null && this.password == null) {
            if(this.password.equals(confirmPassword)) {
                this.userName = userName;
                this.password = password;
                return true;
            }
            else {
                System.out.println("Password and Confirm password mismatched!");
                return false;
            }
        }
        System.out.println("Already registered!");
        return false;
    }

    public void logout() {
        System.out.println("Logging out!!!");
    }
}
