package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAnArrayList {
    public static void main(String[] args) {

        List<Integer> needToSort = new ArrayList<>(Arrays.asList(45,24,54,21,81,24,79,37));


        for (Integer integer : needToSort) {
            System.out.print(integer+"  ");
        }
        System.out.println();

        needToSort = needToSort.stream()
                .sorted((a,b)->-a.compareTo(b))//passing our own comparator
                .collect(Collectors.toList());

        for (Integer integer : needToSort) {
            System.out.print(integer+"  ");
        }

    }
}
