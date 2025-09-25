package collection.list.stack.minimunstack;

import java.util.Arrays;

public class MainClassForMin {
    public static void main(String[] args) {
        MinimunStack stack = new MinimunStack();
        stack.push(45);
        stack.push(12);
        stack.push(78);
        stack.push(65);
        stack.push(86);

        System.out.println(stack.size());
        System.out.println(stack.getMin());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

     }
}
