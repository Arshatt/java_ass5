package com.company;

public class Main {

    public static void main(String[] args) {
        ToyotaCar toyotaCar = new ToyotaCar();
        Formula1Car formula1Car = new McLarenCar();
        Formula1Car carAdapter = new CarAdapter(toyotaCar);

        System.out.println("Toyota car - ");
        toyotaCar.driveInCity();
        toyotaCar.fillwithgas();

        System.out.println("Formula 1 car - ");
        formula1Car.driveInNurburgring();

        System.out.println("Car adapter");
        carAdapter.driveInNurburgring();
    }
}
