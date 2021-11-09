package com.company;

public class SportCar extends Car{
    SportCar(Engine engine){
        super(engine);
    }
    public void request(){
        System.out.println("Requesting sport car:");
        engine.start();
    }
}
