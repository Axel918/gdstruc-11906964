package com.drakemayo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // System("pause")
        //Scanner(System.in).nextLine()

        // Card Pile (Player Deck)
        CardStack stack = new CardStack (30);

        // Player Hand
        CardStack playerHand = new CardStack (30);

        // Discarded Pile
        CardStack discardedStack = new CardStack (30);

        stack.push(new Card(1, "Wild Card"));
        stack.push(new Card(2, "Jimmy"));
        stack.push(new Card(3, "Alexis 471"));
        stack.push(new Card(4, "Ace"));
        stack.push(new Card(5,"Anonymous Cat"));
        stack.push(new Card(6, "Queen"));
        stack.push(new Card(7, "Timmy"));
        stack.push(new Card(8, "Spades"));
        stack.push(new Card(9, "Hearts"));
        stack.push(new Card(10, "Red Card"));
        stack.push(new Card(11, "Diamonds"));
        stack.push(new Card(12, "King"));
        stack.push(new Card(13, "Joker"));
        stack.push(new Card(14,"Kimmy"));
        stack.push(new Card(15, "Emily 612"));
        stack.push(new Card(16, "Yellow Card"));
        stack.push(new Card(17, "Anonymous Dog"));
        stack.push(new Card(18, "Blue Card"));
        stack.push(new Card(19, "Angelo"));
        stack.push(new Card(20, "Green Card"));
        stack.push(new Card(21, "Anonymous Fish"));
        stack.push(new Card(22, "Purple Card"));
        stack.push(new Card(23, "Billy"));
        stack.push(new Card(24, "Anonymous Cow"));
        stack.push(new Card(25, "Anonymous Bird"));
        stack.push(new Card(26, "Carl 732"));
        stack.push(new Card(27, "John"));
        stack.push(new Card(28, "Anonymous Chicken"));
        stack.push(new Card(29, "Orange Card"));
        stack.push(new Card(30, "Anonymous Rabbit"));

        Scanner pause = new Scanner(System.in);

        while (!stack.isEmpty())
        {
            // Random Number (For commands)
            Random command = new Random();
            int commandNumber;

            commandNumber = 1 + command.nextInt(3);

            // Random Number of Cards
            Random cardNumber = new Random();
            int number;

            number = 1 + cardNumber.nextInt(5);

            // DRAW X CARDS
            if (commandNumber == 1)
            {
                System.out.println("Draw " + number + " cards.");
                pause.nextLine();

                if (stack.size() < number)
                {
                    System.out.println("Deck only has " + stack.size() + " cards left. Drawing " + stack.size() + " cards instead.");
                    number = stack.size();
                }

                for (int i = 0; i < number; i++)
                {
                    stack.peek();
                    playerHand.push(stack.peek());
                    stack.pop();
                }
                pause.nextLine();
            }
            // DISCARD X CARDS
            else if (commandNumber == 2)
            {
                System.out.println("Discard " + number + " cards.");
                pause.nextLine();

                if (playerHand.size() <= 0)
                {
                    System.out.println("Nothing to discard.");
                }
                else if (playerHand.size() < number && playerHand.size() != 0)
                {
                    System.out.println("Need to discard " + number + " cards, but hand only has " + playerHand.size() + ". Discarding " + playerHand.size() + " cards instead.");
                    number = playerHand.size();

                    for (int i = 0; i < number; i++)
                    {
                        playerHand.peek();
                        discardedStack.push(playerHand.peek());
                        playerHand.pop();
                    }
                }
                else
                {
                    System.out.println("You discarded " + number + " cards.");

                    for (int i = 0; i < number; i++)
                    {
                        playerHand.peek();
                        discardedStack.push(playerHand.peek());
                        playerHand.pop();
                    }
                }
                pause.nextLine();
            }
            // DRAW X CARDS FROM DISCARDED PILE
            else if (commandNumber == 3)
            {
                System.out.println("Get " + number + " cards from discarded pile.");
                pause.nextLine();

                if (discardedStack.size() <= 0)
                {
                    System.out.println("The discarded pile has no cards.");
                }
                else if (discardedStack.size() < number && discardedStack.size() != 0)
                {
                    System.out.println("Discarded stack only has " + discardedStack.size() + " cards. Drawing " + discardedStack.size() + " cards instead.");
                    number = discardedStack.size();

                    for (int i = 0; i < number; i++)
                    {
                        discardedStack.peek();
                        playerHand.push(discardedStack.peek());
                        discardedStack.pop();
                    }
                }
                else
                {
                    System.out.println("You drew " + number + " cards.");

                    for (int i = 0; i < number; i++)
                    {
                        discardedStack.peek();
                        playerHand.push(discardedStack.peek());
                        discardedStack.pop();
                    }
                }
                pause.nextLine();
            }

            System.out.println("Cards in the player's hands:");

            if (playerHand.size() <= 0)
            {
                System.out.println("No cards");
            }
            else
            {
                playerHand.printStack();
            }

            System.out.println("\nTotal number of cards in player's hand: " + playerHand.size());
            System.out.println("Remaining cards in player deck: " + stack.size());
            System.out.println("Number of cards in the discarded pile: " + discardedStack.size());
            pause.nextLine();
        }

        System.out.println("The Player Deck is out of cards!");
    }
}
