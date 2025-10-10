package streams.optionalclass;

import java.util.Optional;

public class OptionalMultiply {
    public static void main(String[] args) {

        Optional<Integer> number1 = Optional.of(10);
        Optional<Integer> number2 = Optional.empty();

        int result =number1
                .map(n -> n * 2)
                .orElse(-1);

        int result2 = number2.map( n-> n * 2)
                .orElse(-1);

        System.out.println(result);
        System.out.println(result2);

    }
}
