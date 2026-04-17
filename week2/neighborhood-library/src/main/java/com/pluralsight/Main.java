package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Book[] books = {
            new Book(1, "978000000001", "Java Basics", false, null),
            new Book(2, "978000000002", "Advanced Java", true, "Alice"),
            new Book(3, "978000000003", "Data Structures", false, null),
            new Book(4, "978000000004", "Algorithms Guide", true, "Bob"),
            new Book(5, "978000000005", "Database Systems", false, null),
            new Book(6, "978000000006", "Operating Systems", true, "Charlie"),
            new Book(7, "978000000007", "Computer Networks", false, null),
            new Book(8, "978000000008", "Software Engineering", true, "David"),
            new Book(9, "978000000009", "Web Development", false, null),
            new Book(10, "978000000010", "Spring Framework", true, "Emma"),
            new Book(11, "978000000011", "Microservices", false, null),
            new Book(12, "978000000012", "Cloud Computing", true, "Frank"),
            new Book(13, "978000000013", "Cyber Security", false, null),
            new Book(14, "978000000014", "Machine Learning", true, "Grace"),
            new Book(15, "978000000015", "Artificial Intelligence", false, null),
            new Book(16, "978000000016", "Python Programming", true, "Henry"),
            new Book(17, "978000000017", "C++ Fundamentals", false, null),
            new Book(18, "978000000018", "Kotlin for Android", true, "Ivy"),
            new Book(19, "978000000019", "DevOps Handbook", false, null),
            new Book(20, "978000000020", "System Design", true, "Jack")
    };
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        boolean programStatus= true;

        while (programStatus){
            showMenu();
            int option= sc.nextInt();

            switch (option){
                case 1:
                    printAllCheckOutBook(false);
                    showCheckOutMenu();
                    String input = sc.next();
                    if(input.equalsIgnoreCase("c")){
                        System.out.print("Select book ID to checkout :");
                        int bookId=sc.nextInt();
                        System.out.println("Type your name :");
                        String name=sc.next();

                        isCheckOutBook(bookId,name,true);
                    }
                    break;
                case 2:
                    printAllCheckOutBook(true);
                    showCheckInMenu();
                    String checkIn = sc.next();
                    if(checkIn.equalsIgnoreCase("c")){
                        System.out.print("Select book ID to check in :");
                        int bookId=sc.nextInt();

                        isCheckOutBook(bookId,"",false);
                    }
                    break;
                case 3:
                    System.out.println("Exit the program");
                    programStatus=false;
                    break;
                default:
                    System.out.println("2");
            }
        }


//        isCheckedOutBooks(true);

    }

    public static void showMenu(){

        System.out.println("----Menu------");
        System.out.println("1. Show Available Books");
        System.out.println("2. Show Checked Out Books");
        System.out.println("3. Exit");
    }

    public static void showCheckOutMenu(){
        System.out.println("C. Check out book");
        System.out.println("X. Go back. Or type any key!");
    }

    public static void showCheckInMenu(){
        System.out.println("C. Check In book");
        System.out.println("X. Go back. Or type any key!");
    }

    public static void printAllCheckOutBook(boolean status){

        for (Book book: books){
            if(status && book.isCheckedOut() || (!status && !book.isCheckedOut()) ) {
                System.out.println(book.toString());
            }
        }
    }

    public static void isCheckOutBook(int id, String name, boolean checkOut){
        boolean isNotFound=true;

        for(Book book : books){
            if(book.getId()== id){
                if(checkOut) {
                    book.checkOut(name);
                    isNotFound=false;
                    System.out.println("Check out book name " + book.getTitle() + " is success. " + name);
                }else {
                    name=book.getCheckedOutTo();
                    book.checkIn();
                    isNotFound=false;
                    System.out.println("Check in book name " + book.getTitle() + " is success." + name);
                }
            }
        }
        if(isNotFound){
            System.out.println("Your book id "+id+" is not found!");
        }
    }
}