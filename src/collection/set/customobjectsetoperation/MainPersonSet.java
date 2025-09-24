package collection.set.customobjectsetoperation;

import java.util.*;

public class MainPersonSet {

    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        // Adding persons
        people.add(new Person("vinay", 30));
        people.add(new Person("ullas", 25));
        people.add(new Person("ullas", 30)); // duplicate -> will not be added

        // Printing set
        System.out.println("People in set: " );
        for (Person person : people) {
            System.out.println(people);
        }

        // Check if a person exists
        Person searchPerson = new Person("ullas", 30);
        if (people.contains(searchPerson)) {
            System.out.println(searchPerson + " is in the set ✅");
        } else {
            System.out.println(searchPerson + " is NOT in the set ❌");
        }
    }
}
