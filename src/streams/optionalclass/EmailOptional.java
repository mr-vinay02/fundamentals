package streams.optionalclass;

import java.util.Optional;

public class EmailOptional {
    public static void main(String[] args) {

        String email1 = "vinayvini4630@gmail.com";
        String email2 = null;

        String result = Optional.ofNullable(email1).orElse("default@gmail.com");
        String result2 = Optional.ofNullable(email2).orElse("NULL");

        System.out.println(result);
        System.out.println(result2);

        String optional = Optional.ofNullable(email1).orElseThrow(() -> new IllegalArgumentException("Email can't be null"));

        System.out.println(optional);
    }
}
