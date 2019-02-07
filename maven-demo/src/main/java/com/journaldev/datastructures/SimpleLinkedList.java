package com.journaldev.datastructures;

public class SimpleLinkedList
{
    Node head;
    
    static class Node
    {
        int val;
        Node next;
        
        Node(int value)
        {
           val = value;
           next = null;
        }      
    }
    
    /* This function prints contents of linked list starting from head */
    public void printList() 
    { 
        Node n = head; 
        while (n != null) 
        { 
            System.out.print(n.val+" "); 
            n = n.next; 
        } 
    } 
    
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) 
    {
        SimpleLinkedList sll = new SimpleLinkedList();
        
        sll.head = new Node(11);
        Node second = new Node(2); 
        Node third  = new Node(3);
        
        sll.head.next = second;
        second.next = third;
    }

}
