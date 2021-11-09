package com.company;

public class ApartmentFacade {
    private FlatApartment flatApartment;
    private PenthouseApartment penthouseApartment;
    private HouseApartment houseApartment;

    public ApartmentFacade(){
        flatApartment = new FlatApartment();
        penthouseApartment = new PenthouseApartment();
        houseApartment = new HouseApartment();
    }

    public void hasWindows(){
        flatApartment.hasWindows();
        penthouseApartment.hasWindows();
        houseApartment.hasWindows();
    }

    public void hasDoors(){
        flatApartment.hasDoors();
        penthouseApartment.hasDoors();
        houseApartment.hasDoors();
    }

    public void hasWalls(){
        flatApartment.hasWalls();
        penthouseApartment.hasWalls();
        houseApartment.hasWalls();
    }

    public void hasFloor(){
        flatApartment.hasFloor();
        penthouseApartment.hasFloor();
        houseApartment.hasFloor();
    }
}
