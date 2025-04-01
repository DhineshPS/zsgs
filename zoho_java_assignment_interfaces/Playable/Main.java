import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = true, choosePlayer;
        String choice;

        while(isPlaying) {

            Playable player = PlayerFactory.getPlayer();

            if(player == null)
                System.out.println("Enter Valid choice!");
            else {
                isPlaying = true;
                choosePlayer = true;
                while(choosePlayer) {
                    System.out.println("Choose Action : \n1. Play\n2. Pause\n3. Stop\n4. ChangePlayer\n5. Exit");
                    choice = scanner.nextLine();
                    switch(choice) {
                        case "1" -> {
                            player.play();
                        }
                        case "2" -> {
                            player.pause();
                        }
                        case "3" -> {
                            player.stop();
                        }
                        case "4" -> {
                            choosePlayer = false;
                        }
                        case "5" -> {
                            return;
                        }
                        default -> {
                            System.out.println("Enter Valid choice!");
                        }
                    }
                }
            }           
        }
    }
}
