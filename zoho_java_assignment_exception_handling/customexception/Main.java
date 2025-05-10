import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int speed = scanner.nextInt();

        try {
            checkSpeed(speed);
            System.out.println("Correct Speed!");
        } catch (LegalSpeedException e) {
            System.out.println(e);
        }
    }

    private static void checkSpeed(int speed) throws LegalSpeedException{
        if(speed > 120)
            throw new LegalSpeedException();
    }
}
