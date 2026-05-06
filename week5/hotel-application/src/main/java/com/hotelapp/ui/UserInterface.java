package com.hotelapp.ui;

import com.hotelapp.model.*;
import com.hotelapp.service.EmployeeService;
import com.hotelapp.service.ReservationService;
import com.hotelapp.service.RoomService;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);

    private RoomService roomService = new RoomService();
    private ReservationService reservationService = new ReservationService();
    private EmployeeService employeeService = new EmployeeService();

    private Guest guest;
    private Room room;
    private Reservation reservation;
    private Employee employee;

    public UserInterface() {
        guest = new Guest("John Smith", "555-1234", "john.smith@email.com");
        room = new Room(101, RoomType.KING, 200.00, true);
        employee = new Employee(1, "Sarah Johnson", "Front Desk Clerk");

        reservation = new Reservation(
                guest,
                room,
                LocalDate.of(2026, 5, 10),
                LocalDate.of(2026, 5, 13)
        );

    }

    public void startMenu() {
        boolean running = true;

        while (running) {
            displayHeader();
            displayMenuOptions();

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            switch (choice) {
                case 1:
                    roomService.displayRoomInfo(room);
                    break;
                case 2:
                    guest.displayGuestInfo();
                    break;
                case 3:
                    employeeService.displayEmployeeInfo(employee);
                    break;
                case 4:
                    reservationService.displayReservationSummary(reservation);
                    break;
                case 5:
                    reservationService.confirmReservation(reservation);
                    break;
                case 6:
                    reservationService.cancelReservation(reservation);
                    break;
                case 7:
                    updateGuestContactInfo();
                    break;
                case 8:
                    updateEmployeeRole();
                    break;
                case 9:
                    roomService.markRoomAsAvailable(room);
                    break;
                case 10:
                    roomService.markRoomAsOccupied(room);
                    break;
                case 0:
                    running = false;
                    System.out.println("Thank you for using the Hotel Application!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number from the menu.");
                    break;
            }

            if (running) {
                pause();
            }
        }
    }

    private void displayHeader() {
        System.out.println("===================================");
        System.out.println("        HOTEL APPLICATION");
        System.out.println("===================================");
    }

    private void displayMenuOptions() {
        System.out.println("1. Display room information");
        System.out.println("2. Display guest information");
        System.out.println("3. Display employee information");
        System.out.println("4. Display reservation summary");
        System.out.println("5. Confirm reservation");
        System.out.println("6. Cancel reservation");
        System.out.println("7. Update guest contact information");
        System.out.println("8. Update employee role");
        System.out.println("9. Mark room as available");
        System.out.println("10. Mark room as occupied");
        System.out.println("0. Exit");
        System.out.println("-----------------------------------");
    }

    private void updateGuestContactInfo() {
        System.out.print("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter new email address: ");
        String email = scanner.nextLine();

        guest.updateContactInfo(phoneNumber, email);

        System.out.println("Guest contact information updated.");
    }

    private void updateEmployeeRole() {
        System.out.print("Enter new employee role: ");
        String role = scanner.nextLine();

        employeeService.assignRole(employee, role);
    }

    private void pause() {
        System.out.println();
        System.out.print("Press Enter to return to the menu...");
        scanner.nextLine();
    }
}
