package com.company;

public class DoorAndWindows {

    private int numberOfDoors;
    private int numberOfWindows;
    private int doorLength;
    private int doorWidth;
    private int windowLength;
    private int windowWidth;

    public DoorAndWindows(int numberOfDoors, int numberOfWindows, int doorLength, int doorWidth, int windowLength, int windowWidth) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.doorLength = doorLength;
        this.doorWidth = doorWidth;
        this.windowLength = windowLength;
        this.windowWidth = windowWidth;
    }

    public void WindowsAndDoor(String color){
        System.out.println("Door and windows color are " +color);
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getDoorLength() {
        return doorLength;
    }

    public int getDoorWidth() {
        return doorWidth;
    }

    public int getWindowLength() {
        return windowLength;
    }

    public int getWindowWidth() {
        return windowWidth;
    }



}
