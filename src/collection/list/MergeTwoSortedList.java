package collection.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedList {
    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>(Arrays.asList(10,20,30));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(15,28,35));

        List<Integer> sorted = new LinkedList<>();

        int i =0,j =0;

        while(i < list1.size() && j < list2.size())
        {
            if(list1.get(i) < list2.get(j))
            {
                sorted.add(list1.get(i));
                i++;
            }
            else {
                sorted.add(list2.get(j));
                j++;
            }
        }

        if(i < list1.size())
        {
            while(i < list1.size())
            {
                sorted.add(list1.get(i));
                i++;
            }
        }

        if(j < list2.size())
        {
            while(j < list1.size())
            {
                sorted.add(list2.get(j));
                j++;
            }
        }

        System.out.println(sorted);

    }
}
