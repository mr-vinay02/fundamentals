package datastructure;

import java.util.Stack;

public class SingleLinkedList<T> {

    // create a class called Node
    class Node{
        T data;
        Node next;

        Node(T data)
        {
            this.data = data;
        }
    }

    // for the first node as a Head
    Node head = null;

    //   for adding the element at the last
    public void add(T data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //  Adding element in the first
    public void addFirst(T data)
    {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Adding element in the middle
    public void addMiddle(T data,int index)
    {
        Node newNode = new Node(data);

        Node temp = head;
        while(temp.next != null && index > 1) {
            temp = temp.next;
            index--;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //   Displaying All the element
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    // delete element from the First
    public T deleteFirst()
    {
        if(head == null)
            return null;

        T data = head.data;
        head = head.next;
        return data;
    }



    // delete element from the Last
    public T deleteLast()
    {
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        T data = temp.next.data;
        temp.next = null;
        return data;
    }


    // delete element in the Specific index
    public T delete(int index)
    {
        if(head.next == null)
            return null;

        Node temp = head ;
        Node prev = null;

        while(temp.next != null && index > 1)
        {
            prev = temp;
            temp = temp.next;
            index--;
        }

        T data = temp.data;
        if( prev == null )
            head = head.next;

        else
            prev.next = temp.next;

        return data;
    }


    // print element from backward
    public void printBackwards()
    {
        print(head);
    }
    public void print(Node start)
    {
        if(start == null)
            return;
        print(start.next);
        System.out.println(start.data);
    }


    // reserve the list
    public void reverse()
    {
         Node previous = null;
         Node current = head;
         Node next = null;

         while(current != null)
         {
             next = current.next;
             current.next = previous;
             previous = current;
             current = next;
         }
         head = previous;
    }

    // count of the element in the list
    public int size()
    {
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    // sum of the element in the list   // if it is number
//    public int sum()
//    {
//        int sum =0;
//        Node temp = head;
//        while(temp != null)
//        {
//            sum += temp.data;
//            temp = temp.next;
//        }
//        return sum;
//    }

    // Does it contains a loop
    public boolean isLoop()
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && slow != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast)
                return true;
        }
        return false;
    }

    public boolean checkPalindrome()
    {
        Stack<T>  stack = new Stack<T>();
        Node fast = head;
        Node slow = head;
        while(slow != null && fast.next != null)
        {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null)
        {
            slow = slow.next;
        }

        while(slow != null)
        {
            if( !slow.data.equals(stack.pop()))
            {
                return false;
            }
        }
        return true;
    }
}
