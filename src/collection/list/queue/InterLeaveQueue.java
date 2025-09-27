package collection.list.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveQueue {

    private static int[] interLeaved(int[] array) {

        int[] result = new int[array.length];

        Queue<Integer> queue = new LinkedList<>();

        int half = array.length / 2;

        for (int i = half; i < array.length; i++) {
            queue.offer(array[i]);
        }

        int j =0;
        for (int i = 0; i < half; i++) {
            result[j++] = array[i];
            result[j++] = queue.poll();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50,60};

        int[] interLeaved = interLeaved(array);

        System.out.println(Arrays.toString(interLeaved));
    }

}
