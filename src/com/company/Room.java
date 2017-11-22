package com.company;

public class Room {

    private DoorAndWindows doorAndWindows;
    private Furniture furniture;
    private FloorBuilt floorBuilt;

    public Room(DoorAndWindows doorAndWindows, Furniture furniture, FloorBuilt floorBuilt) {
        this.doorAndWindows = doorAndWindows;
        this.furniture = furniture;
        this.floorBuilt = floorBuilt;
    }


    public DoorAndWindows getDoorAndWindows() {
        return doorAndWindows;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public FloorBuilt getFloorBuilt() {
        return floorBuilt;
    }

}
