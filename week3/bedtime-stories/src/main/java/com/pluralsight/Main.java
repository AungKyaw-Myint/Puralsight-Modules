package com.pluralsight;

import java.io.*;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        EmployeeList employeeDataLoad= new EmployeeList();
        List<Employee> employeeList=employeeDataLoad.fileReader();

        for(Employee e: employeeList){
            System.out.println(e.toString());
        }

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the name of a story:");
        String fileName=sc.next();
        getReader(fileName);
    }

    public static void getReader(String filePath) {
        try {
            File file = new File("/C:/pluralsight/Puralsight-Modules/week3/bedtime-stories/src/main/resources/"+filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            int counter = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(counter+". " +line);
                counter++;
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
