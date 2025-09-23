package collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayList {
    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>(Arrays.asList(10,20,30,52,80,50));

        int rototeByk = 2;

        List<Integer> rototed = new ArrayList<>();

        rototed.addAll(elements.subList(elements.size()-rototeByk,elements.size()));

        rototed.addAll(elements.subList(0,elements.size()-rototeByk));

        System.out.println("Elements before rotote :");
        for (Integer integer : elements) {
            System.out.print (integer +" ");
        }
        System.out.println();

        System.out.println("Elements After rotote ");
        for (Integer integer : rototed) {
            System.out.print(integer + "  ");
        }
    }
}
