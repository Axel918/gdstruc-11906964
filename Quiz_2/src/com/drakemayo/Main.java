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

        // Prints the linked list
        // Tells if the list contains an element based on user input
        // Tells the index number of that element
        playerLinkedList.printList();

        // Reprints the linked list
        // but the 1st element has been removed
        playerLinkedList.printList();
    }
}
