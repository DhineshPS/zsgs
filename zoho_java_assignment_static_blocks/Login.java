import java.util.Scanner;

public class Login {

    static String correctUsername;
    static String correctPassword;

    static {
        correctUsername = "admin";
        correctPassword = "password123";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (authenticate(enteredUsername, enteredPassword)) {
            System.out.println("Login successful. Welcome, " + enteredUsername + "!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }

    public static boolean authenticate(String username, String password) {
        return username.equals(correctUsername) && password.equals(correctPassword);
    }
}
