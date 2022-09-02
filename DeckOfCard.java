package com.bridgelabz;

public class DeckOfCard {
    public static void main(String[] args) {
        System.out.println("Welcome to Deck of Card:");
        String[] suits = {"Spades","Heart","Diamonds","Clubs"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[][] playerCards = new String[4][13];
        for (int i =0; i<4; i++) {
            for (int j = 0; j < 13; j++) {
                playerCards[i][j] = suits[i] + " " + ranks[j];
            }
        }
        Shuffle shuffle = new Shuffle();
        shuffle.shuffleCards(playerCards);
        for(int i =0; i<4; i++){
            System.out.println();
            System.out.println("Card for Player "+(i+1));
            System.out.println();
            for(int j = 0; j<9; j++){
                System.out.println(playerCards[i][j]);
            }
        }
    }
}
