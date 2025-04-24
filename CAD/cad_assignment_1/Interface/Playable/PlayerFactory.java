import java.util.Scanner;

public class PlayerFactory {
    public static Playable getPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the Player : \n1. Mp3 Player \n2. CD Player \n3. Streaming Player\n");
        String choice = scanner.nextLine();
        switch(choice) {
            case "1" -> {
                return new MP3Player();
            }
            case "2" -> {
                return new CDPlayer();
            }
            case "3" -> {
                return new StreamingPlayer();
            }
            default -> {
                return null;
            }
        }
    }
}
