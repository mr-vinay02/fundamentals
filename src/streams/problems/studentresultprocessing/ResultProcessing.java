package streams.problems.studentresultprocessing;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class ResultProcessing {
    public static void main(String[] args) {


        List<Student> students = Arrays.asList(
                new Student(1, "Sahil", 88),
                new Student(2, "Anita", 76),
                new Student(3, "Suresh", 45),
                new Student(4, "Meena", 92),
                new Student(5, "Ravi", 34)
        );

        // Find the first student whose name starts with "S".
        Optional<Student> nameStartsWithS = students.stream()
                .filter(s -> s.getName().toLowerCase().startsWith("s") )
                .findFirst();

        nameStartsWithS.ifPresentOrElse(System.out::println,() -> System.out.println("Student with name starts with S not present in the List"));



        // Check if all students scored above 35.
        boolean resultAllAbove35 = students.stream()
                .anyMatch(s-> s.getScore() > 35);

        System.out.println(resultAllAbove35);

        //Get the average score of the class.
        OptionalDouble averageOfScore = students.stream()
                .mapToDouble(Student::getScore)
                .average();

        System.out.println(averageOfScore);


    }
}
