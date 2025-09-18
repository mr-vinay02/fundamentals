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

    public void push(T data)
    {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    public T pop()
    {
        T data = top.data;
        top = top.next;
        return data;
    }
}
