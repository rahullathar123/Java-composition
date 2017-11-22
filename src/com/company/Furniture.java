package com.company;

public class Furniture {

    private String singleOrDoubleBed;
    private boolean isTvAvailable;
    private boolean isPhoneIncluded;
    private boolean isAlmirahIncluded;
    private FloorBuilt floorBuilt;



    public Furniture(String singleOrDoubleBed, boolean isTvAvailable, boolean isPhoneIncluded, boolean isAlmirahIncluded) {
        this.singleOrDoubleBed = singleOrDoubleBed;
        this.isTvAvailable = isTvAvailable;
        this.isPhoneIncluded = isPhoneIncluded;
        this.isAlmirahIncluded = isAlmirahIncluded;
    }

    public void furnitureOrderThrouh(String order){
        System.out.println("Furniture order through "+order);
    }

    public String getSingleOrDoubleBed() {
        return singleOrDoubleBed;
    }

    public boolean getTvAvailable() {
        return isTvAvailable;
    }

    public boolean getPhoneIncluded() {
        return isPhoneIncluded;
    }

    public boolean isAlmirahIncluded() {
        return isAlmirahIncluded;
    }







}
