package collection.list.stack;

import java.util.Stack;

import static java.util.Collections.reverse;

public class ReverseStack {

    static void reverse(Stack<Integer> stack)
    {
        if(stack.empty())
            return;

        int top = stack.pop();

        reverse(stack);

        insertAtBottom(stack, top);
    }

    private static void insertAtBottom(Stack<Integer> stack, int top) {
        if(stack.empty())
        {
            stack.push(top);
            return;
        }

        int element = stack.pop();
        insertAtBottom(stack, top);
        stack.push(element );
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);
        reverse(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}
