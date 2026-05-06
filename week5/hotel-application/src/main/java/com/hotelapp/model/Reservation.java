package com.hotelapp.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private Guest guest;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Reservation(Guest guest, Room room, LocalDate checkInDate, LocalDate checkOutDate) {

        this.guest = guest;

        this.room = room;

        this.checkInDate = checkInDate;

        this.checkOutDate = checkOutDate;

    }



    public long calculateNumberOfNights() {

        return ChronoUnit.DAYS.between(checkInDate, checkOutDate);

    }



    public double calculateTotalPrice() {

        return calculateNumberOfNights() * room.getPricePerNight();

    }



    public void confirmReservation() {

        room.markAsOccupied();

        System.out.println("Reservation confirmed.");

    }



    public void cancelReservation() {

        room.markAsAvailable();

        System.out.println("Reservation cancelled.");

    }
}
