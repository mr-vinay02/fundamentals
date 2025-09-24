package collection.set;

import java.util.*;

public class CheckSubSet {
    public static void main(String[] args) {
        // Example 1: HashSet
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Using HashSet: " + setB.containsAll(setA)); // true

        // Example 2: LinkedHashSet (keeps insertion order)
        Set<Integer> setC = new LinkedHashSet<>(Arrays.asList(2, 3));
        Set<Integer> setD = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Using LinkedHashSet: " + setD.containsAll(setC)); // true

        // Example 3: TreeSet (keeps sorted order)
        Set<Integer> setE = new TreeSet<>(Arrays.asList(1, 3));
        Set<Integer> setF = new TreeSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Using TreeSet: " + setF.containsAll(setE)); // true
    }
}
