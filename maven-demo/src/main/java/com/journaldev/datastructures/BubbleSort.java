package com.journaldev.datastructures;

import java.util.Arrays;

public class BubbleSort
{
    public static void bubbleSort(int[] numbers)
    {
        System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = numbers.length - 1; j > i; j--)
            {
                if (numbers[j] < numbers[j - 1])
                {
                    swap(numbers, j, j - 1);
                }
            }
        }
        System.out.printf("Sorted Array using Bubble sort algorithm :%s %n", Arrays.toString(numbers));
    }

    /* * Utility method to swap two numbers in array */
    public static void swap(int[] array, int from, int to)
    {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }

    public static void bubbleSortImproved(int[] number)
    {
        boolean swapped = true;
        int last = number.length - 2;
        while (swapped)
        {
            swapped = false;
            for (int i = 0; i <= last; i++)
            {
                if (number[i] > number[i + 1])
                { // pair is out of order, swap them
                    swap(number, i, i + 1);
                    swapped = true; // swapping occurred
                }
            } // after each pass largest element moved to end of array
            last--;
        }
    }

    public static void main(String args[])
    {
        int[] test = { 20,10,30,5,40 };
        System.out.println("Before Sorting : " + Arrays.toString(test));
        bubbleSortImproved(test);
        System.out.println("After Sorting : " + Arrays.toString(test));
    }

}
