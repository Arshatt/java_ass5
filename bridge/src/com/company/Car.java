package com.company;

public abstract class Car {
    Engine engine;

    public void setMomentum(Engine engine){
        this.engine = engine;
    }

    Car(Engine engine){
        this.engine = engine;
    }

    void request(){
        engine.start();
    }
}
