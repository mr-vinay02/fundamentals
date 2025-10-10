package streams.terminaloperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Vinay","ullas","abhi"));

        names.stream()
                .forEach(System.out::println);
    }
}
