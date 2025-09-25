package collection.list.stack;

import java.util.Stack;

public class EvalulatePostfix {

    private static int evaluatePostfix(String postfix) {

        Stack<Integer> stack  = new Stack<>();
        for(char ch : postfix.toCharArray())
        {
            if(Character.isDigit(ch))           //"231*+9-"
                stack.push(ch - '0');

            else{
                int value1 = stack.pop();
                int value2 = stack.pop();

                switch (ch)
                {
                    case '+' :
                        stack.push(value2 + value1);
                        break;

                    case '-' :
                        stack.push(value2 - value1);
                        break;

                    case '/' :
                        stack.push(value2 / value1);


                    case '*' :
                        stack.push(value2 * value1);
                        break;

                    case '^' :
                        stack.push((int)Math.pow(value2,value1));
                        break;
                }
            }

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "231*+9-";  // equivalent to (2 + (3*1)) - 9
        System.out.println("Postfix Evaluation: " + evaluatePostfix(postfix));
    }


}
