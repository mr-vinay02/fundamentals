package datastructure.stackimplementation;

public class MainStack {
    public static void main(String[] args) {

        StackUsingLinkedList<String> stack = new StackUsingLinkedList<String>();

        stack.push("Vinay");
        stack.push("archana");
        stack.push("ullas");
        stack.push("vijay");

        stack.display();

        System.out.println(stack.peek());
        System.out.println(stack.getSize());

        System.out.println(stack.pop());

        boolean rs = stack.isEmpty();
        System.out.println(rs);



    }
}
