package collection.customobject;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfPerson {

    public static void main(String[] args) {

        Set<Person> set1 = new TreeSet<>(Arrays.asList(
                new Person("Vinay",23),
                new Person("Mariii",22),
                new Person("ullas",24)));

        Set<Person> set2 = new TreeSet<>(Arrays.asList(
                new Person("Vinay",23),
                new Person("abhi",78)));


        Set<Person> union = new TreeSet<>(set1);

        union.addAll(set2);

        System.out.println(union);

    }

}
