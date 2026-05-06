package com.hotelapp.service;

import com.hotelapp.model.Reservation;

public class ReservationService {
    public void confirmReservation(Reservation reservation) {

        reservation.confirmReservation();

    }



    public void cancelReservation(Reservation reservation) {

        reservation.cancelReservation();

    }



    public long calculateNumberOfNights(Reservation reservation) {

        return reservation.calculateNumberOfNights();

    }



    public double calculateTotalPrice(Reservation reservation) {

        return reservation.calculateTotalPrice();

    }



    public void displayReservationSummary(Reservation reservation) {

        System.out.println("Number of nights: " + reservation.calculateNumberOfNights());

        System.out.println("Total price: " + reservation.calculateTotalPrice());

    }
}
