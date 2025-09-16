package logicalproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubarrayWithGivenSum {

    static List<Integer> findingSubarray(int[] array , int targetSum)
    {
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < array.length; end++) {
            currentSum += array[end];


            while (currentSum > targetSum && start <= end) {
                currentSum -= array[start];
                start++;
            }


            if (currentSum == targetSum) {
                List<Integer> result = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    result.add(array[i]);
                }
                return result;
            }
        }


        return Collections.emptyList();
    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 7, 5};
        int target = 12;

        List<Integer> subArray = findingSubarray(array,target);

        System.out.println(subArray);

    }
}
