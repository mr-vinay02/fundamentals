package logicalproblems;

import java.util.stream.IntStream;

public class Print1to100 {
    public static void main(String[] args) {


        IntStream.rangeClosed(1,100)
                .forEach(System.out::println);
    }
}
