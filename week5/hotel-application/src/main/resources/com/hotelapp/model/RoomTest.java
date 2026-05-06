package com.hotelapp.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {


    private Room room;

    // 🔹 BEFORE EACH TEST
    @BeforeEach
    void setUp() {
        room = new Room(101, RoomType.SINGLE, 1200.0, true);
        System.out.println("Room created before test");
    }

    // 🔹 AFTER EACH TEST
    @AfterEach
    void tearDown() {
        room = null;
        System.out.println("Room cleaned after test");
    }

    @org.junit.jupiter.api.Test
    void checkIn() {
        room = new Room(101, RoomType.SINGLE, 1200.0, true);
        room.checkIn();

        assertTrue(room.isOccupied());
        assertFalse(room.isAvailable());
        assertTrue(room.isDirty());

    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        room.checkIn();
        room.checkOut();
        assertFalse(room.isOccupied());
//        assertTrue(room.isAvailable());
    }

    @org.junit.jupiter.api.Test
    void cleanroom() {
        room.checkOut();
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }
}