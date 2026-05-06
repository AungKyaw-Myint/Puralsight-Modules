package com.hotelapp.model;

public class Room {

    private int roomNumber;
    private RoomType roomType;
    private double pricePerNight;
    private boolean isAvailable;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int roomNumber, RoomType roomType, double pricePerNight, boolean isAvailable) {

        this.roomNumber = roomNumber;

        this.roomType = roomType;

        this.pricePerNight = pricePerNight;

        this.isAvailable = isAvailable;

    }



    public boolean checkAvailability() {

        return isAvailable;

    }



    public void markAsOccupied() {

        isAvailable = false;

    }



    public void markAsAvailable() {

        isAvailable = true;

    }



    public double getPricePerNight() {

        return pricePerNight;

    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void checkIn(){
        this.isOccupied=true;
        this.isDirty=true;
        this.isAvailable=false;
    }
    public void checkOut(){
        this.isOccupied=false;
    }
    public void cleanroom(){
        this.isDirty=false;
        this.isAvailable=true;
    }


    public void displayRoomInfo() {

        System.out.println("Room number: " + roomNumber);

        System.out.println("Room type: " + roomType);

        System.out.println("Price per night: " + pricePerNight);

        System.out.println("Available: " + isAvailable);

    }
}
