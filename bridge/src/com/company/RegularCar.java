package com.company;

public class RegularCar extends Car{
    RegularCar(Engine engine){
        super(engine);
    }
    public void request(){
        System.out.println("Requesting regular car:");
        engine.start();
    }
}
