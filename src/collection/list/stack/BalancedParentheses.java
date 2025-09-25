package collection.list.stack;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean checkBalancedString(String input) {

        Stack<Character> stack = new Stack();
        for (char ch : input.toCharArray()) {
            String in = "{([", out = "}])";
            if (in.indexOf(ch) != -1) {
                stack.push(ch);
            } else if (out.indexOf(ch) != -1) {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if(top == '(' && ch != ')' || top == '{' && ch != '}' || top == '[' && ch != ']' )
                    return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String input = "{{()}}";

        System.out.println(checkBalancedString(input));
    }
}
