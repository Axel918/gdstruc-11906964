package com.drakemayo;

public class Main {

    public static void main(String[] args) {
        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM WARDELL", 640);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 604);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);

        // Print Hashtable
        System.out.println("Print Hashtable (No Deletions)");
        hashtable.printHashtable();

        // Remove Subroza from the Hashtable
        hashtable.remove("Subroza");

        // Reprinted Hashtable (Subroza is Removed)
        System.out.println("\nReprint Hashtable (Subroza is Removed)");
        hashtable.printHashtable();
    }
}
