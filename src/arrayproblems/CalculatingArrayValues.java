package arrayproblems;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class CalculatingArrayValues {
    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};

        IntSummaryStatistics finds = Arrays.stream(array)
                                            .summaryStatistics();

        System.out.println("Max value of the array is :"+finds.getMax());

        System.out.println("Min value of the array is :"+finds.getMin());

        System.out.println("Average of the array is :"+finds.getAverage());

        System.out.println("Sum of the array is :"+finds.getSum());

        System.out.println("Counting Number of the Values in the array is :"+finds.getCount());







    }
}
