package streams.terminaloperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalOperation {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("VInay","ullas","abhi" , "VIJAY");

        Optional<String> first =  names.stream().findFirst();

        first.ifPresent(System.out::println);

        Optional<String> any = names.stream().filter(s-> s.startsWith("V")).findAny();

        any.ifPresentOrElse(System.out::println,()-> System.out.println("NO name"));

    }
}
