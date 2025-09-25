package collection.list.linkedlist;

import com.sun.source.tree.WhileLoopTree;

public class ReorderList {

    private static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static void display(Node head)
    {
        Node temp = head ;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static Node reOrder(Node head)
    {
        Node slow = head , fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow);
        Node firstHalf = head;
        Node startsFOr = null;
        Node stopsHere = null;
        while(firstHalf != slow && secondHalf != null)
        {
           Node first = firstHalf;
           Node second = secondHalf;

           if(startsFOr == null){
               startsFOr = first;
               first.next = second;
               stopsHere = second;
           }
           else {

               stopsHere.next = first;
               first.next = second;

               stopsHere = second;
           }
           firstHalf = firstHalf.next;
           secondHalf = secondHalf.next;
        }
        return startsFOr;
    }

    public static Node reverse(Node first){
        Node curr = first;
        Node prev=null,next=null;
        while(curr != null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        display(head);

        display(reOrder(head));

    }
}
