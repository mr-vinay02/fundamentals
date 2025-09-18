package datastructure.search;

public class LinearSearch {

    static int linearSearch(int[] array , int target)
    {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {

        int[] array = {10,20,30,40,50,60};
        int target = 50;

         int index = linearSearch(array,target);

        System.out.println(index >= 0 ? "Target found at "+index : "Target not found!!!!!");

    }
}
