package collection.list.stack.queue;

import java.util.Stack;

public class Queue<T> {

    Stack<T> stack = new Stack<>();

    public void push(T data){
        stack.push(data);
    }

    public T remove()
    {
       return stack.removeFirst();
    }

    public int size()
    {
        return stack.size();
    }
}
