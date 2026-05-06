package com.hotelapp.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private LocalDateTime dateTime= LocalDateTime.now();
    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee(101, "John Doe", "Manager");
        System.out.println("Room created before test");
    }

    @Test
    void punchTimeCard() {
//        employee.punchTimeCard();

    }

    @Test
    void punchIn() {
        employee.punchIn(dateTime);

        assertEquals(employee.getPunchIn(), dateTime);
    }

    @Test
    void testPunchOut() {
        employee.punchOut(dateTime);

        assertEquals(employee.getPunchOut(), dateTime);
    }
}