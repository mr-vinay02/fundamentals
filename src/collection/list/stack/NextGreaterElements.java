package collection.list.stack;

import java.util.Stack;

public class NextGreaterElements {

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] nge = nextGreaterElements(arr);

        System.out.println("Array: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }


        System.out.println("\nNext Greater Elements: ");
        for (int x : nge) {
            System.out.print(x + " ");
        }

    }

    private static int[] nextGreaterElements(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {

            while(!stack.empty() && arr[i] >= stack.peek()){
                stack.pop();
            }

            result[i] = stack.empty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        return result;
    }
}
