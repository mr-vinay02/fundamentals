package arrayproblems;

import java.lang.annotation.Target;
import java.util.Arrays;

public class LongestSubarraySumK {

    static int[] longestSubArrayOfTarget(int[] numbers, int target){

        int maxLength = 0;
        int[] longestSubArray = new int[0];


        for (int i = 0; i < numbers.length; i++) {
            int sum =0;
            for (int j = i; j < numbers.length; j++) {
                sum += numbers[j];

                if(sum == target){
                    int length = (j - i -1);
                    if(length > maxLength){
                        longestSubArray = Arrays.copyOfRange(numbers,i,j+1);
                    }
                }
            }
        }
        return longestSubArray;
    }

    public static void main(String[] args) {

        int[] numbers = {-1,10,4,-5,-8,9,-2,-4,5,3};
        int target = 0;

        int[] result = longestSubArrayOfTarget(numbers,target);

        System.out.println(Arrays.toString(result));
    }
}
