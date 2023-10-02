package com.company;

import java.util.Random;

public class Player {
    private int permScore;
    private int tempScore;
    Random random;
    private String name;


    public Player(String name) {
        this.name = name;
        permScore = 0; // domyślnie 0
        tempScore = 0;
        random = new Random();
    }

    public void rollDice(){

        int dice1 = random.nextInt(6)+1;
        int dice2 = random.nextInt(6)+1;
        System.out.println("Pierwsza kość: " + dice1 + " Druga kość: " + dice2);

        if (dice1 == 1 || dice2 == 1){
            System.out.println("Przegrałeś");
            resetTemp();
        }else{
            tempScore = tempScore + (dice1 + dice2);
        }
    }

    public void hold(){
        permScore = permScore + tempScore;
        resetTemp();
    }

    public void resetTemp(){
        tempScore = 0;
    }

    public int getTempScore(){
        return tempScore;
    }

    public void printResults(){
        System.out.println("Wynik tymczasowy: " + tempScore + "\nWynik stały: " + permScore);
    }

    public String getName(){
        return name;
    }
}
