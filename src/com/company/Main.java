package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie pierwszego gracza: ");
        String name = scanner.nextLine();
        Player player1 = new Player(name);
        System.out.println("Podaj imie drugiego gracz: ");
        name = scanner.nextLine();
        Player player2 = new Player(name);

        Player[] players = new Player[2];
        players[0] = player1;
        players[1] = player2;

        int currentPlayerIndex = 0;

        while(true){
            System.out.println("Obecny gracz: " + players[currentPlayerIndex].getName());
            System.out.println("1. Rzuć \n2. Pasuj");
            int choice = scanner.nextInt();
            if(choice == 1){
                players[currentPlayerIndex].rollDice();
                if(players[currentPlayerIndex].getTempScore() == 0){
                    if(players[currentPlayerIndex].getTempScore() == 0){
                        if(currentPlayerIndex == 0){
                            currentPlayerIndex = 1;
                        }else{
                            currentPlayerIndex = 0;
                        }
                    }
                }
            }else if(choice == 2){
                players[currentPlayerIndex].hold();
                if(currentPlayerIndex == 0){
                    currentPlayerIndex = 1;
                }else{
                    currentPlayerIndex = 0;
                }
            }
            players[currentPlayerIndex].printResults();
        }

    }

}
