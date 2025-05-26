public class MP3Player implements Playable{
    public void play() {
        System.out.println("Mp3 player is playing!");
    }

    public void pause() {
        System.out.println("Mp3 player is paused!");
    }

    public void stop() {
        System.out.println("Mp3 player is stopped!");
    }
}
