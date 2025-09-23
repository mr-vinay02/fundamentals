package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoLists {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10,20,30,40,50,60,70);
        List<Integer> list2 = Arrays.asList(10,30,40,50,70);


        List<Integer> intersection = new ArrayList<>(list1);

        intersection.retainAll(list2);

        for (Integer integer : intersection) {
            System.out.println(integer);
        }
    }
}
