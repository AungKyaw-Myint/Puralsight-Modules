package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJackMain {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Total players: ");
        int totalPlayers= scanner.nextInt();
        scanner.nextLine();
        if(totalPlayers <= 5) {

            List<Player> playerList= new ArrayList<>();

            for (int i=1; i<=totalPlayers; i++){
                String playerName="";
                System.out.print("Enter player "+i+" name: ");
                playerName= scanner.nextLine();
                Player player=new Player(playerName);
                playerList.add(player);
            }


            Deck deck = new Deck();
            deck.shuffle();

            // Deal 2 cards each
            for (int i = 0; i < 2; i++) {
                for(Player player: playerList) {
                    player.getHand().addCard(deck.dealCard());
//                    System.out.println("\n" + player.getName() + "'s Hand:");
//                    player.getHand().displayHand();
                }
            }

            Player winner = null;
            int highestScore = 0;
            boolean tie = false;

            for (Player player : playerList) {
                System.out.println("\n" + player.getName() + "'s Hand:");
                player.getHand().displayHand();

                int score = player.getHand().getValue();

                // skip busts
                if (score > 21) {
                    continue;
                }

                if (score > highestScore) {
                    highestScore = score;
                    winner = player;
                    tie = false;
                }
                else if (score == highestScore) {
                    tie = true;
                }
            }
            System.out.println("\nWinner:");

            if (winner == null) {
                System.out.println("Nobody wins!");
            }
            else if (tie) {
                System.out.println("Tie Game!");
            }
            else {
                System.out.println(winner.getName() + " wins with " + highestScore + "!");
            }

            scanner.close();
        }else{
            System.out.println("Only 5 players allowed!");
        }
    }
}
