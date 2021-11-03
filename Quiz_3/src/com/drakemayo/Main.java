package com.drakemayo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(7);

        int game = 0;
        int playerNumber = 1;
        Scanner pause = new Scanner(System.in);

        while (game < 10)
        {
            // Generates random no. of players from 1 to 7
            Random x = new Random();
            int xPlayers = 1 + x.nextInt(7);

            System.out.println("Games made: " + game);
            System.out.println("Queueing...");
            pause.nextLine();

            System.out.println(xPlayers + " Players have been found!");

            for (int i = 0; i < xPlayers; i++)
            {
                queue.add(new Player(playerNumber, "Player " + playerNumber));
                System.out.println("Player " + playerNumber);
                playerNumber++;
            }
            pause.nextLine();

            System.out.println("\nPlayers in Lobby (Number: " + queue.size() + "):");
            queue.printFullQueue();
            pause.nextLine();

            if (queue.size() >= 5)
            {
                System.out.println("A game will start! The first 5 players will be removed.");
                pause.nextLine();

                // Deletes first 5 players from the queue
                for (int i = 0; i < 5; i++)
                {
                    queue.remove();
                }

                System.out.println("\nPlayers left in the lobby: ");
                queue.printFullQueue();

                if (queue.size() <= 0)
                {
                    System.out.println("None");
                }

                game++;
                pause.nextLine();
            }
        }

        System.out.println("Matchmaking Finished!");
        System.out.println(game + " games have been made.");
    }
}
