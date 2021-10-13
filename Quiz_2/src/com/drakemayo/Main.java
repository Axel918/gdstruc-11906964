package com.drakemayo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Linked List");
        Player asuna = new Player(1, "Asuna", 100);
        Player lethalbacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);
        Player heathcliff = new Player(4,"Heathcliff", 56);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        PlayerLinkedList.addToFront(hpDeskjet);
        PlayerLinkedList.addToFront(lethalbacon);
        PlayerLinkedList.addToFront(asuna);
        PlayerLinkedList.addToFront(heathcliff);

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Input ID Number");
        int idNumber = scanner1.nextInt();

        System.out.println("Input a name (Case Sensitive)");
        String name = scanner2.nextLine();

        System.out.println("Input Level Number");
        int levelNumber = scanner3.nextInt();

        List<Player> playerList = new ArrayList<>();

        // Prints the linked list
        System.out.println("\nPrint the Linked List");
        playerLinkedList.printList(playerList);

        // Prints the number of elements present in the linked list
        playerLinkedList.printSize();

        // Checks if the linked list contains a certain element
        playerLinkedList.containsElement(idNumber, name, levelNumber, playerList);

        // Indicates the index number of the input element
        playerLinkedList.indexNumber(idNumber, name, levelNumber, playerList);

        // Reprints the linked list
        // but the 1st element has been removed
        System.out.println("\nPrint the Linked List (1st Element has been removed)");
        playerLinkedList.printList(playerList);

        // Prints the number of elements present in the linked list
        playerLinkedList.printSize();
    }
}
