package collection.arraylist;

import java.util.Arrays;
import java.util.List;

public class ReverseAnList {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10,20,30,40,50,60,70);

        int low = 0;
        int high = list1.size()-1;
        while(low < high)
        {
            Integer temp = list1.get(low);
            list1.set(low , list1.get(high));
            list1.set(high , temp);
            low++;
            high--;
        }

        list1.forEach(System.out::println);
    }
}
