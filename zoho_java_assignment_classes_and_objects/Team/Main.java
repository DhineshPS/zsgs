import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Team team1 = new Team("CSK", "Chennai", "Tamil Nadu");
        team1.hireCoach();
        Team team2 = new Team("MI", "Mumbai", "Maharashtra");
        team2.hireCoach();
        Team team3 = new Team("RCB", "Bangalore", "Karnataka");
        team3.hireCoach();

        Player p11 = new Player("MS Dhoni", "WK", 7);
        Player p12 = new Player("Suresh Raina", "Batsman", 3);
        team1.addPlayer(p11);
        team1.addPlayer(p12);        

        Player p21 = new Player("Rohit Sharma", "Batsman", 45);
        Player p22 = new Player("Sachin Tendulkar", "Batsman", 10);
        team2.addPlayer(p21);
        team2.addPlayer(p22);        

        Player p31 = new Player("Virat Kohli", "Batsman", 18);
        Player p32 = new Player("AB de villiers", "WK", 17);
        team3.addPlayer(p31);
        team3.addPlayer(p32);

        team1.displayTeam();
        team2.displayTeam();
        team3.displayTeam(); */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Teams : ");
        int numberOfTeams = scanner.nextInt();
        System.out.print("Enter number of Players in each team : ");
        int numberOfPlayers = scanner.nextInt();
        ArrayList<Team> teams = new ArrayList<>();

        //Team Creation
        for(int teamNo = 0; teamNo < numberOfTeams; teamNo++) {
            System.out.println("Enter Team Name : ");
            String teamName = scanner.nextLine();
            System.out.println("Enter City : ");
            String city = scanner.nextLine();
            System.out.println("Enter Division : ");
            String division = scanner.nextLine();

            Team team = new Team(teamName, city, division);
            team.hireCoach();

            System.out.println("Enter " + numberOfPlayers + " number of players : ");
            
            //Player Creation
            for(int playerNo = 0; playerNo < numberOfPlayers; playerNo++) {
                System.out.println("Enter Player Name : ");
                String playerName = scanner.nextLine();
                System.out.println("Enter Player Position " );
                String position = scanner.nextLine();
                System.out.println("Enter Player Jersey number : ");
                int jerseyNumber = scanner.nextInt();

                Player player = new Player(playerName, position, jerseyNumber);
                team.addPlayer(player);
            }
        }

        boolean playOrTrain = true;

        while(playOrTrain) {
            System.out.println("==================================");
            System.out.println("1. Train Player");
            System.out.println("2. Player Play");
            System.out.println("3. Play Team");
            System.out.println("4. Exit");
            System.out.println("==================================");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1 -> { 
                    System.out.println("Enter Team name : ");
                    String teamName = scanner.nextLine();
                    System.out.println("Enter player to train : ");
                    String playerName = scanner.nextLine();
                }
            }
        }
    }
}
