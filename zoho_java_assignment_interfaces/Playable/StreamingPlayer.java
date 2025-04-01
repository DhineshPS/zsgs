public class StreamingPlayer implements Playable{
    public void play() {
        System.out.println("Streaming player is playing!");
    }

    public void pause() {
        System.out.println("Streaming player is paused!");
    }

    public void stop() {
        System.out.println("Streaming player is stopped!");
    }
}
