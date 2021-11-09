package com.company;

public class HouseApartment implements Apartment{
    @Override
    public void hasWindows() {
        System.out.println("Every house has windows");
    }

    @Override
    public void hasDoors() {
        System.out.println("Every house has doors");
    }

    @Override
    public void hasWalls() {
        System.out.println("Every house has walls");
    }

    @Override
    public void hasFloor() {
        System.out.println("Every house has floor");
    }
}
