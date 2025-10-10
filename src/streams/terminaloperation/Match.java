package streams.terminaloperation;

import java.util.Arrays;
import java.util.List;

public class Match {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,81,61,654,21,62,61,512,516,75);

        boolean anyone = numbers.stream().anyMatch(n -> n == 61);

        System.out.println(anyone);

        numbers = Arrays.asList(45,45,45,45,45);

        boolean everyone = numbers.stream().allMatch( n -> n == 45 );

        System.out.println(everyone);

        numbers = Arrays.asList(10,81,61,654,21,62,61,512,516,75);

        boolean noone = numbers.stream().noneMatch(n -> n == 45 );

        System.out.println(noone);
    }
}
