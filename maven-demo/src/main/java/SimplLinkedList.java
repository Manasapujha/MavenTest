
public class SimplLinkedList
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
    
    Node traverse()
    {
        Node p1;
        Node p2;
        
        if(head == null)
        {
            return head;
        }
        p1=head;
        p2=head;
        
        while(p2.next != null)
        {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

    public static void main(String[] args)
    {
        SimplLinkedList sll = new SimplLinkedList();
        
        sll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        sll.head.next = second;
        second.next = third;
        
        System.out.println(sll.traverse().val);

    }
}
