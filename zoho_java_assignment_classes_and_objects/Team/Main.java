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
        scanner.nextLine();
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

            System.out.println("Enter " + numberOfPlayers + " players of team : ");
            
            //Player Creation
            for(int playerNo = 0; playerNo < numberOfPlayers; playerNo++) {
                System.out.println("Enter Player Name : ");
                String playerName = scanner.nextLine();
                System.out.println("Enter Player Position " );
                String position = scanner.nextLine();
                System.out.println("Enter Player Jersey number : ");
                int jerseyNumber = scanner.nextInt();
                scanner.nextLine();

                Player player = new Player(playerName, position, jerseyNumber);
                team.addPlayer(player);
            }
            teams.add(team);
        }

        boolean playOrTrain = true;

        while(playOrTrain) {
            System.out.println("==================================");
            System.out.println("1. Train Player");
            System.out.println("2. Play Player");
            System.out.println("3. Play Team");
            System.out.println("4. Display Team");
            System.out.println("4. Exit");
            System.out.println("==================================");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                
                case 1 -> { 

                    for(Team team : teams) {
                        team.displayTeam();
                    }

                    System.out.print("Enter Team Number : ");
                    int teamNumber = scanner.nextInt();
                    scanner.nextLine();

                    if(teamNumber > teams.size() && teamNumber < 0) {
                        System.out.println("Choose valid team");
                        break;
                    }
                    else {
                        Team currTeam = teams.get(teamNumber - 1);
                        System.out.println("Enter Player Name : ");
                        String pName = scanner.nextLine();

                        for(Player player : currTeam.teamPlayers) {
                            if(player.playerName.equals(pName)) {
                                player.train();
                            }
                        }
                    }
                }

                case 2 -> { 
                    
                    for(Team team : teams) {
                        team.displayTeam();
                    }

                    System.out.print("Enter Team Number : ");
                    int teamNumber = scanner.nextInt();
                    scanner.nextLine();

                    if(teamNumber > teams.size() && teamNumber < 0) {
                        System.out.println("Choose valid team");
                        break;
                    }
                    else {
                        Team currTeam = teams.get(teamNumber - 1);
                        System.out.println("Enter Player Name : ");
                        String pName = scanner.nextLine();

                        for(Player player : currTeam.teamPlayers) {
                            if(player.playerName.equals(pName)) {
                                player.playGame();
                            }
                        }
                    }
                }

                case 3 -> {
                    for(Team team : teams) {
                        team.displayTeam();
                    }

                    System.out.print("Enter Team Number : ");
                    int teamNumber = scanner.nextInt();
                    scanner.nextLine();

                    if(teamNumber > teams.size() && teamNumber < 0) {
                        System.out.println("Choose valid team");
                        break;
                    }
                    else {
                        Team currTeam = teams.get(teamNumber - 1);
                        currTeam.playGame();    
                    }                    
                }

                case 4 -> {
                    for(Team team : teams) {
                        team.displayTeam();
                    }
                }

                case 5 -> {
                    System.out.println("=======");
                    System.out.println("Exiting");
                    System.out.println("=======");
                    playOrTrain = false;
                }

                default -> {
                    System.out.println("Enter Valid choice !!!");
                    System.out.println();
                }
            }
        }
    }
}
