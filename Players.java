package com.bridgelabz;

import java.util.ArrayList;

public class Players {
    Card[] playerCards = new Card[9];

    static ArrayList<Players> playerList = new ArrayList<>();

    public static void addPlayer(Players players){
        playerList.add(players);
    }
}
