package com.hotelapp.model;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedBasicRooms;
    private int bookedSuites;

    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name=name;
        this.numberOfSuites=numberOfSuites;
        this.numberOfRooms=numberOfRooms;
        this.bookedBasicRooms=0;
    }
    public Hotel(String name, int numberOfSuites
            , int numberOfRooms, int bookedSuites
            , int bookedBasicRooms){
        this.name=name;
        this.numberOfSuites=numberOfSuites;
        this.numberOfRooms=numberOfRooms;
        this.bookedBasicRooms=bookedBasicRooms;
    }

    public Hotel() {
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite){

        if (isSuite) {
            if (numberOfRooms <= getAvailableSuites()) {
                bookedSuites += numberOfRooms;
                return true;
            }
        } else {
            if (numberOfRooms <= getAvailableRooms()) {
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    // Derived getter (no backing variable)
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    // Optional getter for name
    public String getName() {
        return name;
    }
}
