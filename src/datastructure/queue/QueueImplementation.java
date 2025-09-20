package datastructure.queue;

public class QueueImplementation<T> {

    private class Node<T> {
        T data;

        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front , rear;
    private int size;

    public QueueImplementation() {
        front = rear = null;
        this.size = 0;
    }

    public void display()
    {
        System.out.println("queue :");
        Node temp = front;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void add(T data)
    {
        Node newNode = new Node(data);
        if(front == null)
            rear = front = newNode;
        else {
            rear.next = newNode;
            rear = rear.next;//rear = newNode;
        }
        size++;
    }


    public T remove()
    {
        T value = (T) front.data;
        if(front != null)
        {
            front = front.next;
        }
        if(front == null)
            rear = null;

        size--;
        return value;
    }

    public T peek()
    {
        if(front == null)
            return null;
        else
            return (T)front.data;
    }

    public boolean isEmpty()
    {
        return front == null && rear == null;
    }

    public int size() {
        return size;
    }
}
