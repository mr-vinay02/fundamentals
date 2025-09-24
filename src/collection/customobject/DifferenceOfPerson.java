package collection.customobject;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DifferenceOfPerson {

    public static void main(String[] args) {

        Set<Person> set1 = new TreeSet<>(Arrays.asList(
                new Person("Vinay",23),
                new Person("Mariii",22),
                new Person("ullas",24)));

        Set<Person> set2 = new TreeSet<>(Arrays.asList(
                new Person("Vinay",23),
                new Person("abhi",78)));


        Set<Person> difference = new TreeSet<>(set1);

        difference.removeAll(set2);

        System.out.println(difference);

    }
}
