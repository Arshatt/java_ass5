package com.company;

public class ToyotaCar implements Car{
    @Override
    public void driveInCity() {
        System.out.println("Drive only in city");
    }

    @Override
    public void fillwithgas() {
        System.out.println("Fill your car with gas");
    }
}
