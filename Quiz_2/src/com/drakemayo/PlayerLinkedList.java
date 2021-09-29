package com.drakemayo;

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
        PlayerNode current = head;
        int size = 0;

        System.out.print("Head -> ");
        while(current != null)
        {
            //System.out.print(current.getPlayer().getName() + ", Level: " + current.getPlayer().getLevel() + ", ID:" + current.getPlayer().getId());
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
            size++;
        }
        System.out.println("null");
        System.out.println("Element count: " + size);


    }

    public void deleteElement()
    {
        PlayerNode current = head;
    }
}
