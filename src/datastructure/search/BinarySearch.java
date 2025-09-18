package datastructure.search;

public class BinarySearch {

    static int binarySearch(int[] array,int target)
    {
        int low = 0;
        int high = array.length;

        while(low <= high)
        {
            int middle = (low + high) / 2;

            if(array[middle] == target)
                return middle;

            else if (array[middle] > target)
                low = low + 1;

            else
                high = high +1;
        }
        return  -1;
    }

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50,60};
        int target = 50;

        int index = binarySearch(array,target);

        System.out.println(index >= 0 ? "Target found at "+index : "Target not found!!!!!");

    }
}
