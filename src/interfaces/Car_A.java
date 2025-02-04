package interfaces;

import interfaces.Car;
import interfaces.Engine;
import interfaces.MediaPlayer;

public class Car_A {
    private  EngineObj engine;
    private  CDPlayer mp;
    private  BrakeShoe br;
    private Car_A(){
        this.engine = new EngineObj();
        this.mp = new CDPlayer();
        this.br = new BrakeShoe();

    }
    private static Car_A car_A;
    public static Car_A getInstance(){
        if (car_A==null){
            car_A = new Car_A();
        }
        return car_A;
    }
    void start(){
        engine.start();
    }
    void stop(){
        engine.stop();
    }
    void acc(){
        engine.acc();

    }
    void startMusic(){
        mp.start();
    }
    void stopMusic(){
        mp.stop();
    }
    void brake(){
        br.brake();
    }


}