package arrayproblems;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PositiveNegativeInArray {
    public static void main(String[] args) {

        int[] array = {-10,10,20,-20,-30,30,-40,40};
        int[] positive = new int[array.length];
        int[] negative = new int[array.length];

        int positiveIndex = 0,negativeIndex = 0;
         for(int element : array)
        {
            if(element > 0)
                positive[positiveIndex++] = element;

            else
                negative[negativeIndex++] = element;

        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(positive));
        System.out.println(Arrays.toString(negative));
    }
}
