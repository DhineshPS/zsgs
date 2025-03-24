import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    public String teamName;
    public String city;
    public String division;
    public String coachName;
    private static int teamCount = 0;
    private final int teamNumber;

    Scanner scanner = new Scanner(System.in);
    ArrayList<Player> teamPlayers = new ArrayList<>();

    Team(String teamName, String city, String division) {
        this.teamName = teamName;
        this.city = city;
        this.division = division;
        this.teamNumber = ++teamCount;
    }

    public void addPlayer(Player player) {
        teamPlayers.add(player);
    }

    public void setCoach(String coachName) {
        this.coachName = coachName;
    }

    public void playGame() {
        System.out.println(teamName + " is playing game.");
    }

    public void hireCoach() {
        System.out.print("Enter Coach name : ");
        setCoach(scanner.nextLine());
    }

    public void displayTeam() {
        int num = 0;
        System.out.println(teamNumber + ". Players of Team " + teamName);
        for(Player player : teamPlayers) {
            System.out.println("Player " + ++num + " : " + player.playerName + " trained " + player.trainingCount + " times, Played " + player.playCount + " games");
        }
        System.out.println("Coach name : " + coachName);
    }
}
