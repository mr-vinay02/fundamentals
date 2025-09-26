package collection.list.queue.stackusingqueue;

import java.util.*;

public class Stack<T> {
    private Queue<T> q1 = new LinkedList<>();
    private Queue<T> q2 = new LinkedList<>();

    public void push(T data) {
        q2.add(data);
        while (!q1.isEmpty())
            q2.add(q1.remove());
        Queue<T> tmp = q1;
        q1 = q2;
        q2 = tmp;
    }

    public T pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack empty");
        return q1.remove();
    }

    public T top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack empty");
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
