package collection.list.stack;

import collection.set.insurancemanagmentsystem.Policy;

import java.util.Stack;

public class StockSpanProblem {

    public static int[] calculateSpan(int[] prices){
        int[] span = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < prices.length; i++) {
            while(!stack.empty() && prices[1] >= prices[stack.peek()])
            {
                stack.pop();
            }

            span[i] = stack.empty() ? i+1 : (i - stack.peek());

            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateSpan(prices);

        System.out.println("Stock Prices: ");
        for (int p : prices) {
            System.out.print(p + " ");
        }

        System.out.println("\nStock Spans: ");
        for (int s : spans) {
            System.out.print(s + " ");
        }

    }
}
