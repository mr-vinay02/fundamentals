package logicalproblems;

import java.util.Arrays;

public class MissingNumberInArthmeticProgression {

    public static void main(String[] args) {

        int[] array = {2, 6, 10, 14, 18};
        int[] difference = new int[array.length-1];
        for (int i = 1; i < array.length; i++) {
            difference[i-1] = array[i] - array[i-1];
        }

        System.out.println(Arrays.toString(difference));
        int differnceBetweenTwoNumber = difference[0];
        for(int element : difference)
        {
            if(element == differnceBetweenTwoNumber)
                continue;
        }

        System.out.println(differnceBetweenTwoNumber);
    }

}
