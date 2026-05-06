package com.hotelapp.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Employee {

    private int employeeId;
    private String name;
    private String role;
    private String department;
    private double payRate;
    private double regularHoursWorked;
    private double overtimeHoursWorked;
    private LocalDateTime punchIn;
    private LocalDateTime punchOut;

    public Employee(int employeeId, String name, String role) {

        this.employeeId = employeeId;

        this.name = name;

        this.role = role;
        this.punchIn=null;
        this.punchOut=null;

    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getRegularHoursWorked() {
        return regularHoursWorked;
    }

    public void setRegularHoursWorked(double regularHoursWorked) {
        this.regularHoursWorked = regularHoursWorked;
    }

    public double getOvertimeHoursWorked() {
        return overtimeHoursWorked;
    }

    public void setOvertimeHoursWorked(double overtimeHoursWorked) {
        this.overtimeHoursWorked = overtimeHoursWorked;
    }

    public void displayEmployeeInfo() {

        System.out.println("Employee ID: " + employeeId);

        System.out.println("Name: " + name);

        System.out.println("Role: " + role);

    }



    public void assignRole(String role) {

        this.role = role;

    }

    public LocalDateTime getPunchIn() {
        return punchIn;
    }

    public LocalDateTime getPunchOut() {
        return punchOut;
    }

    public double getTotalPay(){
        return (regularHoursWorked * payRate) + (overtimeHoursWorked * payRate * 1.5);
    }

    public void punchTimeCard(){

        if(punchIn != null){
            Duration diff = Duration.between(LocalDateTime.now(), punchIn);

            if(diff.toHours() > 8){
                overtimeHoursWorked+= diff.toHours()-8;
            }else{
                regularHoursWorked+=diff.toHours();
            }
        }else{
            this.punchIn=LocalDateTime.now();
        }
    }

    public void punchIn(LocalDateTime time){
        this.punchIn=time;
    }
    public void punchIn(){
        this.punchIn=LocalDateTime.now();
    }
    public void punchOut(LocalDateTime time){
        this.punchOut=time;
    }
    public void punchOut(){
        this.punchOut=LocalDateTime.now();
    }

}
