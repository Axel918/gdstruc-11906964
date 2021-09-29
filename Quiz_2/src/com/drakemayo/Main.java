package com.drakemayo;

public class Main {

    public static void main(String[] args) {
        Player asuna = new Player(1, "Asuna", 100);
        Player lethalbacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        PlayerLinkedList.addToFront(asuna);
        PlayerLinkedList.addToFront(lethalbacon);
        PlayerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.printList();
    }
}
