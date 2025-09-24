package collection.set.performancecomparision;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LinkedHashSetPerformance {
    public static void main(String[] args) {

        Set<Integer> numbers = new LinkedHashSet<>();

        long start = System.currentTimeMillis();

        IntStream.range(0, 100000)
                .forEach(numbers::add);

        long end = System.currentTimeMillis();

        System.out.println("Numbers of the object to the Hash Set : " + numbers.size());

        System.out.println("Time taken to do the task is : " + (end - start) + "(ms)");
    }
}