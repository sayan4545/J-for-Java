package interfaces;

public class EngineObj implements Engine{
    @Override
    public void start() {
        System.out.println("Start eng");
    }

    @Override
    public void stop() {
        System.out.println("stop eng");

    }

    @Override
    public void acc() {
        System.out.println("acc eng");

    }
}
