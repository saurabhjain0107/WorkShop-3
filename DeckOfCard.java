package com.bridgelabz;

public class DeckOfCard {

    static void initializeCards(){
        System.out.println("initializing cards...");
        int cardIndex=0;
        for (int i = 0; i < Card.suitArray.length; i++) {
            for (int j = 0; j < Card.rankArray.length; j++) {
                Card card=new Card(Card.suitArray[i],Card.rankArray[j]);
                Card.cardArray[cardIndex++]=card;
            }
        }
        printCards(Card.cardArray);
    }

     static void printCards(Card[] cards) {
            System.out.print("Cards{");
            for (Card card : cards) {
                System.out.print(card.getSuit() + "-" + card.getRank() + ", ");
            }
            System.out.println("}");
        }

    public static void main(String[] args) {
        System.out.println("Welcome to Deck of Card:");
        initializeCards();

    }
}
