package collection.set;

import java.util.*;
import java.util.stream.Collectors;

public class SetBehavior {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(45,61,76,79,13,56,61,45,76,82,92,95,69,18);

        Set<Integer> hashSet = new HashSet<>(list);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
        Set<Integer> treeSet = new TreeSet<>(list);

        System.out.println("Hash Set :");
        hashSet.stream().forEach((k) -> System.out.print(k +"  "));
        System.out.println();
        System.out.println("Linked Hash Set :");
        linkedHashSet.stream().forEach((k) -> System.out.print(k +"  "));
        System.out.println();
        System.out.println("Tree Set :");
        treeSet.stream().forEach((k) -> System.out.print(k +"  "));


     }
}
