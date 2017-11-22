package com.company;

public class FloorBuilt {

    private String floorWoodsName;
    private String floorColor;
    private int floorCost;


    public FloorBuilt(String floorWoodsName, String floorColor, int floorCost) {
        this.floorWoodsName = floorWoodsName;
        this.floorColor = floorColor;
        this.floorCost = floorCost;
    }


    public String getFloorWoodsName() {
        return floorWoodsName;
    }

    public String getFloorColor() {
        return floorColor;
    }

    public int getFloorCost() {
        return floorCost;
    }

}
