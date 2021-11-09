package com.company;

public class FlatApartment implements Apartment{
    @Override
    public void hasWindows() {
        System.out.println("Every flat has windows");
    }

    @Override
    public void hasDoors() {
        System.out.println("Every flat has doors");
    }

    @Override
    public void hasWalls() {
        System.out.println("Every flat has walls");
    }

    @Override
    public void hasFloor() {
        System.out.println("Every flat has floor");
    }
}
