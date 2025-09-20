package datastructure.sorting;

import java.util.Arrays;

public class BubbleSort {

    static int[] bubbleSort(int[] array)
    {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;

    }


    public static void main(String[] args) {


        int[] array = {46,81,12,61,97,26,75,91};

        int[] sortedArray = bubbleSort(array);

        System.out.println(Arrays.toString(sortedArray));
    }
}
