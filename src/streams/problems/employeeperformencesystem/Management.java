package streams.problems.employeeperformencesystem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Management {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Aarav", "IT", 75000),
                new Employee(102, "Bhavna", "Marketing", 68000),
                new Employee(103, "Chirag", "Finance", 72000),
                new Employee(104, "Deepa", "HR", 65000),
                new Employee(105, "Eshan", "Engineering", 80000),
                new Employee(106, "Farah", "IT", 67000),
                new Employee(107, "Gaurav", "Support", 60000),
                new Employee(108, "Harsha", "HR", 77000),
                new Employee(109, "Isha", "Marketing", 69000),
                new Employee(110, "Jay", "IT", 71000)
        );

        //From the list, get all employees in "IT" earning more than 50,000.
        employees.stream()
                .filter(a -> a.getDepartment().equals("IT") )
                .filter(a -> a.getSalary() > 50000)
                .forEach(System.out::println);


        // Count how many employees belong to "HR".
        Long hrCount = employees.stream()
                .filter(a->a.getDepartment().equals("HR"))
                .count();

        System.out.println(hrCount);

        //Find the employee with the highest salary using max().
        Optional<Employee> highestPaided = employees.stream()
                                        .max((a,b) -> Double.compare(a.getSalary(), b.getSalary()));


        highestPaided.ifPresentOrElse(System.out::println,() -> System.out.println("NO EMPLOYEE WITH HIGHEST PAIDED"));




    }
}
