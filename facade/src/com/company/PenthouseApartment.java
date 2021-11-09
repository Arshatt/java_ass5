package com.company;

public class PenthouseApartment implements Apartment{
    @Override
    public void hasWindows() {
        System.out.println("Every penthouse has windows");
    }

    @Override
    public void hasDoors() {
        System.out.println("Every penthouse has doors");
    }

    @Override
    public void hasWalls() {
        System.out.println("Every penthouse has walls");
    }

    @Override
    public void hasFloor() {
        System.out.println("Every penthouse has floor");
    }
}
