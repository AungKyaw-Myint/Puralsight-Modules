package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getValue() {

        int total = 0;

        for (Card card : cards) {
            total += card.getValue();
        }

        return total;
    }

    public void displayHand() {

        for (Card card : cards) {
            System.out.println(card);
        }

        System.out.println("Total: " + getValue());
    }

    /*
    private ArrayList<Card> cards;
    public Hand(){
        cards = new ArrayList<>();
    }
    // A Card is dealt to the Hand and the Hand is responsible
    // to store the card
    public void deal(Card card){
        cards.add(card);
    }
    public int getSize(){
        return cards.size();
    }
    // The Hand uses the methods of each card to determine
    // the value of each card - and adds up all values
    /*
    public int getValue(){
        int value = 0;
        for(Card card: cards){
            card.flip(); // turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }
        return value;
    }



    public int getValue() {

        int total = 0;

        try {

            for (Card card : cards) {
                String rank = String.valueOf(card.getValue());

                switch (rank) {
                    case "J":
                    case "Q":
                    case "K":
                        total += 10;
                        break;

                    case "A":
                        total += 11;
                        break;

                    default:
                        total += Integer.parseInt(rank);
                }
            }
        }catch (Exception e){
            System.out.println("Error -->"+e);
        }

        return total;
    }

    public void displayHand() {

        for (Card card : cards) {
            System.out.println(card);
        }

        System.out.println("Total: " + getValue());
    }
    */

}
