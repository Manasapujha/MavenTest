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
            System.out.print(n.val + " ");
            n = n.next;
        }
    }

    /** * Java method to add an element to linked list * @param node */
    public void add(Node node)
    {
        Node current = head;
        while (current != null)
        {
            if (current.next == null)
            {
                current.next = node;
                break;
            }
            current = current.next;
        }
    }

    public void reverse() 
    { 
        Node current = null;
        Node pointer = head;
        Node previous = null;
   
        while (pointer != null) 
        { 
            current = pointer; 
            pointer = pointer.next;
            // reverse the link 
            current.next = previous; 
            previous = current; 
            head = current;     
        }
    }

    /* method to create a simple linked list with 3 nodes */
    public static void main(String[] args)
    {
        SimpleLinkedList sll = new SimpleLinkedList();

        sll.head = new Node(11);
        Node second = new Node(2);
        Node third = new Node(3);

        sll.head.next = second;
        second.next = third;
    }

}
