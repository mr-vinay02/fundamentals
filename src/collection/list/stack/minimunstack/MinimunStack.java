package collection.list.stack.minimunstack;

import java.util.Stack;

public class MinimunStack {

    private Stack<Integer> values = new Stack<>();
    private Stack<Integer> minValues = new Stack<>();

    public void push(int data)
    {
        values.push(data);
        if(minValues.empty() || data < minValues.peek())
            minValues.push(data);
    }

    public boolean pop()
    {
        if(values.empty())  throw new RuntimeException("Stack is underflow");
        int pop = values.pop();
        if(pop == minValues.peek())
            minValues.pop();
        return true;
    }

    public int peek()
    {
        if(values.empty())
            throw new RuntimeException("Stack is underflow");

        return values.peek();
    }

    public int getMin(){
        return minValues.peek();
    }

    public int size()
    {
        return values.size();
    }
}
