package com.company;

public class Main {

    public static void main(String[] args) {

            DoorAndWindows doorAndWindows = new DoorAndWindows(4,5,100,88,12,10);
            Furniture furniture = new Furniture("Single",true,true,true);
            FloorBuilt floorBuilt = new FloorBuilt("Timber","Blue",3600);

            Room theRoom = new Room(doorAndWindows,furniture,floorBuilt);

            theRoom.getDoorAndWindows().WindowsAndDoor("Blue");
            theRoom.getFurniture().furnitureOrderThrouh("Amazon");

        }

    }



