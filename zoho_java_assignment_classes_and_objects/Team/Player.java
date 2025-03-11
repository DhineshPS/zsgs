public class Player {
    public String playerName;
    public String position;
    public int jerseyNumber;

    public int playCount;
    public int trainingCount;

    Player(String playerName, String position, int jerseyNumber) {
        this.playerName = playerName;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.playCount = 0;
        this.trainingCount = 0;
    }

    public void playGame() {
        playCount++;
        System.out.println(playerName + " with Jersey number : " + jerseyNumber + " is playing game");
    }

    public void train() {
        trainingCount++;
        System.out.println(playerName + "with Jersey number : " + jerseyNumber + " is training");
    }

}
