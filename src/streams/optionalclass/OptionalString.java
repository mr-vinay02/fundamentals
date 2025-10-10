package streams.optionalclass;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {

        String string = "vinay";


        String upper = Optional.ofNullable(string)
                .map(String::toUpperCase)
                .orElse("DEFAULT");

        System.out.println(upper);


        String value = null;
        String upper1 = Optional.ofNullable(value)
                .map(String::toUpperCase)
                .orElse("DEFAULT");

        System.out.println(upper1);
    }
}
