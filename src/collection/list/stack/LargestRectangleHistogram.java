package collection.list.stack;

import java.util.Stack;

public class LargestRectangleHistogram {

    private static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maximumArea = 0;

        for (int i = 0; i <=  heights.length; i++) {

            int iHeight =  (i == heights.length) ? 0 :  heights[i];

            while(!stack.isEmpty() && iHeight < heights[stack.peek()]){

                int height = heights[stack.pop()];
                int width ;

                if(stack.isEmpty())
                    width = i;
                else
                    width = i - stack.peek() -1;

                maximumArea = Math.max(maximumArea,(height * width));
            }
            stack.push(i);
        }
        return maximumArea;
    }

    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights));

    }

}
