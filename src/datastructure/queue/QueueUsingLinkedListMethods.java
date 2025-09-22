package datastructure.queue;

import java.util.LinkedList;
import java.util.List;

public class QueueUsingLinkedListMethods<T> {

    List<T> queue = new LinkedList<T>();

    // adding the element to the queue
    public void add(T data)
    {
        queue.addFirst(data);
    }

    // removing the element to the queue
    public T remove()
    {
        return queue.removeLast();
    }

    public T peek()
    {
        return queue.getFirst();
    }

    public int size()
    {
        return queue.size();
    }

    public void display()
    {
        System.out.print("Queue :");
        System.out.print(queue);
        System.out.println();
    }

}
