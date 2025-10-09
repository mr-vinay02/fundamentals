package streams.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

        // take 1 input
        // give 1 boolean

        Predicate<String> checksStartsWithA = (n) -> n.startsWith("A");

        System.out.println(checksStartsWithA.test("Archana"));

        System.out.println(checksStartsWithA.test("Vinay"));

    }
}
