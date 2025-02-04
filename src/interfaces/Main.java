package interfaces;

public class Main {
    public static void main(String[] args) {
        Car_A c = Car_A.getInstance();
        c.start();
        c.startMusic();
        c.stopMusic();
        c.brake();
        c.stop();
        System.out.println(c);
        Car_A d = Car_A.getInstance();
        System.out.println(d);
    }
}
