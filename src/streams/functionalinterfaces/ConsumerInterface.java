package streams.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {

        // input 1
        // return nothing

        Consumer<List<Integer>> numbers = n -> System.out.print(n +" ");

        numbers.accept(Arrays.asList(10,20,30,40,50));
    }
}
