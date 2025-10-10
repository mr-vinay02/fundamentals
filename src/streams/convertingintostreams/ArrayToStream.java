package streams.convertingintostreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {


        int[] array = {10,20,30,40,50};


        array = Stream.of(array)
                .flatMapToInt(Arrays::stream)
                .toArray();

          array  = Arrays.stream(array)
                .toArray();

        System.out.println(Arrays.toString(array));

    }
}
