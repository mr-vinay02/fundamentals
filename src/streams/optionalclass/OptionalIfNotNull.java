package streams.optionalclass;

import java.util.Optional;

public class OptionalIfNotNull {

    public static Optional<String> getname(String name){
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {

        Optional<String> name = getname("Vinay");

        name.ifPresent(System.out::println);

        Optional<String> name2 = getname(null);

        name2.ifPresent(System.out::println);
    }
}
