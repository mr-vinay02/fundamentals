package streams.convertingintostreams;

import java.util.Arrays;

public class ArrayToStream {
    public static void main(String[] args) {


        int[] array = {10,20,30,40,50};

          array  = Arrays.stream(array)
                .toArray();

        System.out.println(Arrays.toString(array));

    }
}
