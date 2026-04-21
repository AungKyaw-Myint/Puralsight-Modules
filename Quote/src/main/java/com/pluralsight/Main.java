package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Quote q1=new Quote(
                "Innovation distinguishes between a leader and a follower.",
                "Steve Jobs",
                "Technology",
                2001);

        System.out.println(q1.toString());

        QuoteManager manager = new QuoteManager();

        manager.printAllQuotes();


    }
}
