package com.hotelapp.model;

public class Guest {

    private String name;
    private String phoneNumber;
    private String email;

    public Guest(String name, String phoneNumber, String email) {

        this.name = name;

        this.phoneNumber = phoneNumber;

        this.email = email;

    }



    public void displayGuestInfo() {

        System.out.println("Guest: " + name);

        System.out.println("Phone: " + phoneNumber);

        System.out.println("Email: " + email);

    }



    public void updateContactInfo(String phoneNumber, String email) {

        this.phoneNumber = phoneNumber;

        this.email = email;

    }
}
