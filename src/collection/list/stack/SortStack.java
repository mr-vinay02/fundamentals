package collection.list.stack;

import java.util.Stack;



public class SortStack {

    static void sort(Stack<Integer> stack)
    {
        if(stack.empty())
            return;

        int top = stack.pop();

        sort(stack);

        insertSorted(stack,top);
    }

    private static void insertSorted(Stack<Integer> stack, int top) {

        if(stack.empty() || stack.peek() <= top){
            stack.push(top);
            return;
        }

        int max = stack.pop();
        insertSorted(stack,top);
        stack.push(max);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(18);
        stack.push(25);
        stack.push(13);
        stack.push(24);

        System.out.println("Original Stack: " + stack);
        sort(stack);
        System.out.println("sorted Stack: " + stack);
    }
}
