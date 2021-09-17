package com.drakemayo;

public class Main {

    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        // Set Array Elements
        numbers[0] = 15;
        numbers[1] = -41;
        numbers[2] = 5;
        numbers[3] = 20;
        numbers[4] = -25;
        numbers[5] = -8;
        numbers[6] = 95;
        numbers[7] = 16;
        numbers[8] = 7;
        numbers[9] = 10;

        System.out.println("Bubble Sort");
        System.out.println("Before");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nAfter (Descending Order)");
        printArrayElements(numbers);

        // Reset Array Elements
        numbers[0] = 15;
        numbers[1] = -41;
        numbers[2] = 5;
        numbers[3] = 20;
        numbers[4] = -25;
        numbers[5] = -8;
        numbers[6] = 95;
        numbers[7] = 16;
        numbers[8] = 7;
        numbers[9] = 10;

        System.out.println("\n------------------------------------");

        System.out.println("Selection Sort");
        System.out.println("Before");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.println("\n\nAfter (Descending Order)");
        printArrayElements(numbers);
    }

    // Bubble Sort
    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    // Print Out Array elements
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
    }
}


