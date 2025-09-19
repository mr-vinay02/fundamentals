package datastructure.stackimplementation;

import java.util.LinkedList;
import java.util.List;

public class StackUsingLinkedListMethods<T> {

    private List<T>  list = new LinkedList<>();


    public void push(T data)
    {
        list.addFirst(data);
    }

    public T pop()
    {
        return list.removeFirst();
    }

    public T peek()
    {
         return  list.getFirst();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public void printStack()
    {
        System.out.println("stack :"+list);
    }

    public int size()
    {
        return list.size();
    }
}
