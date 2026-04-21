package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Quote q1=new Quote("Steve Jobs",
                "Innovation distinguishes between a leader and a follower.",
                "Technology",
                2001);

        System.out.println(q1.toString());
    }
}
