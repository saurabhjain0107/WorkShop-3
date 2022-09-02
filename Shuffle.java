package com.bridgelabz;

public class Shuffle {
    public static void shuffleCards(String[][] arr){
        String temp;
        for (int i =0; i<4; i++){
            for (int j = 0; j<13; j++){
                int suits = (int) ((Math.random()*10) % 4);
                int ranks = (int) ((Math.random() *10) % 13);
                temp = arr[i][j];
                arr[i][j] = arr[suits][ranks];
                arr[suits][ranks ] = temp;
            }
        }
    }
}
