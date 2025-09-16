package arrayproblems;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};


        //  Using the same array
        int start = 0;
        int end = array.length-1;

        while(start < end)
        {
            int temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;

        }

        System.out.println(Arrays.toString(array));



        // Display reverse order of the array Using loop
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();


        // Using Streams
        Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);

    }
}
