package com.drakemayo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerLinkedList {
    public static PlayerNode head;

    public static void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList()
    {
        List<Player> playerList = new ArrayList<>();
        PlayerNode current = head;
        int size = 0;

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Input ID Number");
        int idNumber = scanner1.nextInt();

        System.out.println("Input a name (Case Sensitive)");
        String name = scanner2.nextLine();

        System.out.println("Input Level Number");
        int levelNumber = scanner3.nextInt();

        deleteElement(head);
        System.out.print("\nHead -> ");
        while(current != null)
        {
            playerList.add(current.getPlayer());
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
            size++;
        }
        System.out.println("null");
        System.out.println("Element count: " + size);

        for (Player p : playerList)
        {
            System.out.println(p);
        }

        System.out.println("\nDoes the list contain " + name + "(ID: " + idNumber + ", Level: " + levelNumber + ")?");
        System.out.println(playerList.contains(new Player(idNumber, name, levelNumber)));

        System.out.println("\nIndex Number: ");
        System.out.println(playerList.indexOf(new Player(idNumber, name, levelNumber)));

        deleteElement(head);
    }

    public PlayerNode deleteElement(PlayerNode head)
    {
        if (head == null)
        {
            return null;
        }

        PlayerNode temp = head;
        head = head.getNextPlayer();
        temp.setNextPlayer(null);

        return temp;
    }
}
