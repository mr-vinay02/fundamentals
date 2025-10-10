package streams.terminaloperation;

import java.util.Arrays;
import java.util.List;

public class CountReduce {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,75,81,61,61,21,62,61,512,512,75);

        Integer sum = numbers.stream().reduce( 0 ,(a,b) -> a+b);

        System.out.println(sum);

        Long count = numbers.stream().count();
        System.out.println(count);

    }
}
