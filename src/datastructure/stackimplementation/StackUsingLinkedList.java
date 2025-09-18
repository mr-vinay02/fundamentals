package datastructure.stackimplementation;

public class StackUsingLinkedList<T> {

    class Node{
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node top;
    private int size = 0;

    public void push(T data)
    {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop()
    {
        if(top == null)
            throw new RuntimeException("Stack is Empty");

        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek()
    {
        if(top == null)
            throw new RuntimeException("Stack is Empty");

        return top.data;
    }

    public boolean isEmpty()
    {
        return top == null;
    }


    public void display()
    {
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int getSize()
    {
        return size;
    }
}
