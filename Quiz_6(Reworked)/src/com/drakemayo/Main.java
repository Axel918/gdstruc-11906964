package com.drakemayo;

public class Main {

    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();

        System.out.println("Tree (In Order)");
        tree1.insert(25);
        tree1.insert(17);
        tree1.insert(29);
        tree1.insert(10);
        tree1.insert(16);
        tree1.insert(-5);
        tree1.insert(60);
        tree1.insert(55);

        tree1.traverseInOrder();
        System.out.println("Minimum value is: " + tree1.getMin());
        System.out.println("Maximum value is: " + tree1.getMax());

        System.out.println("\nTree (In Reverse Order)");
        tree2.insertReverse(25);
        tree2.insertReverse(17);
        tree2.insertReverse(29);
        tree2.insertReverse(10);
        tree2.insertReverse(16);
        tree2.insertReverse(-5);
        tree2.insertReverse(60);

        tree2.traverseInOrderDescending();
    }
}
