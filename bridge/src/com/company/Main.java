package com.company;

public class Main {

    public static void main(String[] args) {
        Car x = new RegularCar(new V6Engine());
        x.request();
        x.setMomentum(new V8Engine());
        x.request();
        x.setMomentum(new V12Engine());
        x.request();
    }
}
