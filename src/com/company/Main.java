package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        while (true){
            System.out.println("1. Rzuć \n2. Pasuj");
            int choice = scanner.nextInt();
            if(choice == 1){
                player.rollDice();
            }else if(choice == 2){
                player.hold();
            }

            player.printResults();
        }
    }
}
