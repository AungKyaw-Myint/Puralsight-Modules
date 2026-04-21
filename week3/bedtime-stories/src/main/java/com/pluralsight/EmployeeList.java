package com.pluralsight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    List<Employee> employees= new ArrayList<>();

    public List<Employee> fileReader(){
        try {
            File file = new File("/C:/pluralsight/Puralsight-Modules/week3/bedtime-stories/src/main/resources/payroll.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                Employee employee= new Employee();

                String[] parts = line.split("\\|");

                employee.setEmployeeId(Integer.parseInt(parts[0]));
                employee.setName(parts[1]);
                employee.setHoursWorked(Double.parseDouble(parts[2]));
                employee.setPayRate(Double.parseDouble(parts[3]));

                employees.add(employee);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }
}
