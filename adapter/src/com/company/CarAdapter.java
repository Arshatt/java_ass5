package com.company;

public class CarAdapter implements Formula1Car{
    Car car;

    public CarAdapter(Car car){
        this.car = car;
    }

    @Override
    public void driveInNurburgring() {
        car.fillwithgas();
    }
}
