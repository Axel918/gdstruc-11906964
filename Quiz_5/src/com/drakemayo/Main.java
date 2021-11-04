package com.drakemayo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numbers[] = {5, 45, 68, 55, 14, 7, 1, 100, 32, 75};     // Array of Numbers
        boolean isRunning = true;
        boolean isDecided = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("\tTHE AMAZING SEARCH FUSION ALGORITHM");
        System.out.println("===========================================");

        // Run the code while true
        while (isRunning == true) {
            isDecided = false;

            System.out.println("Input number: ");
            int inputValue = scanner.nextInt();

            System.out.println("\nDoes the system contain the value " + inputValue + "?");
            System.out.println("It's located at index " + searchFusion(numbers, inputValue));

            while (isDecided == false)
            {
                // Lets the user decide if he/she wants to keep the program running
                System.out.println("\nDo you wish to continue(y/n)?");
                char choice = scanner.next().charAt(0);

                if (choice == 'y' || choice == 'Y')
                {
                    isRunning = true;
                    isDecided = true;
                }
                else if (choice == 'n' || choice == 'N')
                {
                    isRunning = false;
                    isDecided = true;
                }
                else
                {
                    System.out.println("Invalid input!");
                }
            }

        }

        System.out.println("\nProgram Terminated!");
    }

    public static int searchFusion(int[] input, int value)
    {
        int start = 0;                      // The starting index
        int end = input.length - 1;         // Points to the last index
        int middle = (start + end) / 2;     // Get the middle of the array

        if (input[middle] == value)
        {
            return middle;
        }

        // Search for the value at the left half
        // starting from left (Starting Point) to right (Index before the middle)
        for (int i = 0; i < middle; i++)
        {
            if (input[i] == value)
            {
                return i;
            }
        }

        // Search for the value at the right half
        // starting from right (End Point) to left (Index after the middle)
        for (int i = end; i > middle; i--)
        {
            if (input[i] == value)
            {
                return i;
            }
        }

        // If value is not found at the middle, and neither
        // of the halves, return -1
        return -1;
    }
}
