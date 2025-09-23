package collection.arraylist;

import java.util.*;

public class UnionOfTwoLists {
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(10,20,30,40,50,60,70);
        List<Integer> list2 = Arrays.asList(10,30,40,50,70);


        Set<Integer> union = new HashSet<>(list1);

        union.addAll(list2);

        union.forEach(System.out::println);
    }
}
