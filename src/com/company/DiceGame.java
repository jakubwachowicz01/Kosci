package com.company;

import java.util.Scanner;

public class DiceGame {

    private int currentPlayerIndex = 0;
    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        Player[] players = playersPrepare();


        while(true){

            Player currentPlayer = players[currentPlayerIndex];
            currentPlayer.printResults();
            System.out.println("Obecny gracz: " + currentPlayer.getName());
            System.out.println("1. Rzuć \n2. Pasuj");
            int choice = scanner.nextInt();
            if(choice == 1){
                currentPlayer.rollDice();
                if(currentPlayer.getTempScore() == 0){
                    if(currentPlayer.getTempScore() == 0){
                        changeCurrentPlayerIndex();
                    }
                }
            }else if(choice == 2){
                currentPlayer.hold();
                changeCurrentPlayerIndex();
            }

        }
    }
    private Player[] playersPrepare(){
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
        return players;
    }

    private void changeCurrentPlayerIndex(){

        if(currentPlayerIndex == 0){
            currentPlayerIndex = 1;
        }else{
            currentPlayerIndex = 0;
        }
    }
}