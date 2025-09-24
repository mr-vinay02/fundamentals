package collection.set.performancecomparision;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class TreeSetPerformance {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        long start = System.currentTimeMillis();

        IntStream.range(0,100000)
                .forEach(numbers::add);

        long end = System.currentTimeMillis();

        System.out.println("Numbers of the object to the Tree Set : "+numbers.size());

        System.out.println("Time taken to do the task is : "+ (end - start)+"(ms)");
    }
}
