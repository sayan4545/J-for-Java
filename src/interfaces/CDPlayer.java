package interfaces;

public class CDPlayer implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("Start mediaPlayer");
    }

    @Override
    public void stop() {
        System.out.println("Stop mediaPlayre");

    }
}
