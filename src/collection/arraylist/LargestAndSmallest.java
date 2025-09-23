package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class LargestAndSmallest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(45,24,54,21,81,24,79,37));

        IntSummaryStatistics summary = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Largest value in the list :"+summary.getMax());
        System.out.println("Largest value in the list :"+summary.getMin());
        System.out.println("Largest value in the list :"+summary.getAverage());
        System.out.println("Largest value in the list :"+summary.getCount());
    }
}
