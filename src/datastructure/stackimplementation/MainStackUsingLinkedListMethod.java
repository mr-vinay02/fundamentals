package datastructure.stackimplementation;

public class MainStackUsingLinkedListMethod {
    public static void main(String[] args) {

        StackUsingLinkedListMethods<String> stack = new StackUsingLinkedListMethods<>();

        stack.push("vinay");
        stack.push("vijay");
        stack.push("ullas");
        stack.push("archana");
        stack.printStack();
        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println("Number of Objects in the stack is :"+stack.size());
    }
}
