package com.journaldev.datastructures;

public class LinkedListFirst
{
    Node head;  // head of list 
    
    /* Linked list Node*/
    class Node 
    { 
        int data; 
        Node next; 
           
        // Constructor to create a new node 
        // Next is by default initialized 
        // as null 
        Node(int d) {data = d;} 
    } 
}
