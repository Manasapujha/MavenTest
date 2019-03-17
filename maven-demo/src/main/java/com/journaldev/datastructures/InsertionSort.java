package com.journaldev.datastructures;

public class InsertionSort
{
    /* * Java implementation of insertion sort algorithm to sort * an integer array. */
    public static void insertionSort(int[] array)
    {
        // insertion sort starts from second element
        for (int i = 1; i < array.length; i++)
        {
            int numberToInsert = array[i];
            int compareIndex = i;
            while (compareIndex > 0 && array[compareIndex - 1] > numberToInsert)
            {
                array[compareIndex] = array[compareIndex - 1];
                // shifting element
                compareIndex--; // moving backwards, towards index 0
            }
        }
    }

}
