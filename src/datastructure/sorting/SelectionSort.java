package datastructure.sorting;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[index])
                    index = j;
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static void main(String[] args) {

        int[] array = {45,78,62,36,56,91,42,12};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
}
