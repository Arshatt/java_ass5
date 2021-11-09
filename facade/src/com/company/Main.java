package com.company;

public class Main {

    public static void main(String[] args) {
        ApartmentFacade apartmentFacade = new ApartmentFacade();
        apartmentFacade.hasWindows();
        System.out.println();
        apartmentFacade.hasDoors();
        System.out.println();
        apartmentFacade.hasWalls();
        System.out.println();
        apartmentFacade.hasFloor();
        System.out.println();
    }
}
