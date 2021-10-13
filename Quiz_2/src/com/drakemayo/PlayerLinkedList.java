package com.drakemayo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerLinkedList {
    public static PlayerNode head;
    public int size;

    // Add an element to the Linked List
    public static void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    // Prints the Linked List
    public void printList(List<Player> playerList)
    {
        PlayerNode current = head;
        size = 0;

        System.out.print("Head -> ");
        while(current != null)
        {
            if (current.getPlayer() != null) {
                playerList.add(current.getPlayer());
                System.out.print(current.getPlayer());
                System.out.print(" -> ");
                sizeCount();
            }

            current = current.getNextPlayer();
        }
        System.out.println("null");

        deleteElement(head);
    }

    // Checks if the linked list contains an element
    public void containsElement(int idNumber, String name, int levelNumber, List<Player> playerList)
    {
        System.out.println("\nDoes the list contain " + name + "(ID: " + idNumber + ", Level: " + levelNumber + ")?");
        System.out.println(playerList.contains(new Player(idNumber, name, levelNumber)));
    }

    // Checks what index number the element is in the Linked List
    public void indexNumber(int idNumber, String name, int levelNumber, List<Player> playerList)
    {
        System.out.println("\nIndex Number: ");
        System.out.println(playerList.indexOf(new Player(idNumber, name, levelNumber)));
    }

    // Counts number of elements in the Linked List
    public int sizeCount()
    {
        size++;

        return size;
    }

    // Prints size count
    public void printSize()
    {
        System.out.println("Element count: " + size);
    }

    // Deletes an element in the linked list
    public PlayerNode deleteElement(PlayerNode head)
    {
        if (head == null)
        {
            return null;
        }

        PlayerNode temp = head;
        head = head.getNextPlayer();
        temp.setPlayer(null);
        temp = temp.getNextPlayer();

        return temp;
    }
}
