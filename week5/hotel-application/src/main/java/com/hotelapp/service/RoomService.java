package com.hotelapp.service;

import com.hotelapp.model.Room;

public class RoomService {
    public void displayRoomInfo(Room room) {

        room.displayRoomInfo();

    }



    public boolean checkAvailability(Room room) {

        return room.checkAvailability();

    }



    public void markRoomAsOccupied(Room room) {

        room.markAsOccupied();

        System.out.println("Room is now occupied.");

    }



    public void markRoomAsAvailable(Room room) {

        room.markAsAvailable();

        System.out.println("Room is now available.");

    }
}
