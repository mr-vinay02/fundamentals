package datastructure.sorting;

import java.util.Arrays;

public class InsertionSort {

    private static void insertionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int key = array[i];
            int j = i-1;

            while( j >= 0 && array[j] > key)
            {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key;

        }
    }

    public static void main(String[] args) {

        int[] array = {45,78,62,36,56,91,42,12};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));

    }


}
