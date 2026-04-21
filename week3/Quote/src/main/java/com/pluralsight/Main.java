package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        String[] quotes = {
                "Innovation distinguishes between a leader and a follower.",
                "Any sufficiently advanced technology is indistinguishable from magic.",
                "The Web does not just connect machines, it connects people.",
                "We can only see a short distance ahead, but we can see plenty there that needs to be done.",
                "The advance of technology is based on making it fit in so that you don't really even notice it.",
                "Technology is best when it brings people together.",
                "The science of today is the technology of tomorrow.",
                "It has become appallingly obvious that our technology has exceeded our humanity.",
                "Computers are useless. They can only give you answers.",
                "First, solve the problem. Then, write the code."
        };

        boolean flag=true;

        Scanner sc= new Scanner(System.in);
        while (flag) {
            System.out.println("Type X to exit!");
            System.out.print("Choose quote no:");
            try {
                int option = sc.nextInt();

                System.out.println(quotes[option]);
            }catch (Exception e){
                System.out.println("Your quote no is not exit!");
                flag=false;
            }



        }



        /*
        Quote q1=new Quote(
                "Innovation distinguishes between a leader and a follower.",
                "Steve Jobs",
                "Technology",
                2001);

        System.out.println(q1.toString());

        QuoteManager manager = new QuoteManager();

        manager.printAllQuotes();

         */

    }
}
