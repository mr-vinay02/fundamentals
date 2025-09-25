package collection.list.stack;

import java.util.Stack;

public class InfixToPostfix {

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1; // lowest
            case '*':
            case '/':
                return 2; // medium
            case '^':
                return 3; // highest
        }
        return -1;
    }

    static String infixToPOstfix(String expression){

        StringBuilder result = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(char ch : expression.toCharArray()){
            if(Character.isLetterOrDigit(ch))                    //"A+B*C"
                result.append(ch);

            else if (ch == '(')
                stack.push(ch);

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.empty() && precedence(stack.peek()) >= precedence(ch))
                {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.toString();
    }


    public static void main(String[] args) {
        String expression1 = "(A+B)*C";
        String expression2 = "A+B*C";
        String expression3 = "A+(B*C-(D/E^F)*G)*H";

        System.out.println(expression1+" --> " +infixToPOstfix(expression1));
        System.out.println(expression2+" --> " +infixToPOstfix(expression2));
        System.out.println(expression3+" --> " +infixToPOstfix(expression3));


    }
}
