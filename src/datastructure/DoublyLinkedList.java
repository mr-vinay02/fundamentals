package datastructure;

import java.util.Stack;

public class DoublyLinkedList<T> {

     //    create a class called NODE
    class Node{
        T data;
        Node prev;
        Node next;

         public Node(T data) {
             this.data = data;
         }
     }

     Node head ;

    public void add(T data)
    {
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;

        else{
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void addFirst( T data)
    {
        Node newNode = new Node(data);

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void add(T data,int index)
    {
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null && index > 1){
            temp = temp.next;
            index--;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
    }

    public void display()
    {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data +"  ");
            temp = temp.next;
        }
    }

    public T deleteFirst()
    {
        T data = head.data;
        head = head.next;
        return data;
    }

    public T deleteLast()
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.prev.next = null;
        return temp.data;
    }

    public T delete(int index) {

        if(index == 0)
            return deleteFirst();

        Node temp = head;

        while(temp.next != null && index > 1)
        {
            temp = temp.next;
            index--;
        }

        if(temp == null)
            throw new IndexOutOfBoundsException();

        temp.prev.next = temp.next;

        if(temp.next != null)
            temp.next.prev = temp.prev;//.next

        return temp.data;
    }

    public void printBackward()
    {
        Node start = head;
        print(start);
    }
    private void print(Node start)
    {

        if(start == null)
            return ;
        print(start.next);
        System.out.print(start.data +"  ");
    }

    public boolean checkPalindrome()
    {
        if(head == null || head.next == null)
            return true;

        Node fast = head;
        while(fast.next != null)
        {
            fast = fast.next;
        }

        Node slow = head;

        while(slow != fast){
            if(slow.data != fast.data)
                return false;
            slow = slow.next;
            fast = fast.prev;
        }
        return true;
    }

}
