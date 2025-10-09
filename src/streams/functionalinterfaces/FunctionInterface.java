package streams.functionalinterfaces;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {

        // take 1 input
        // give 1 output

        // Using lambda function
        Function<Integer,Integer> square = n -> n * n;

        System.out.println(square.apply(10));

        // Using Anonymous Implementation
        Function<String,String> capital = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        System.out.println(capital.apply("vinay"));

        //with method reference
        Function<String,Integer> make = Integer::parseInt;

        System.out.println(make.apply("500"));

    }
}
