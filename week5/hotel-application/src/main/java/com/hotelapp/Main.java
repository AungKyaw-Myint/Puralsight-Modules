package com.hotelapp;

import com.hotelapp.model.*;
import com.hotelapp.service.EmployeeService;
import com.hotelapp.service.ReservationService;
import com.hotelapp.service.RoomService;
import com.hotelapp.ui.UserInterface;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserInterface starter= new UserInterface();
        starter.startMenu();
    }

}