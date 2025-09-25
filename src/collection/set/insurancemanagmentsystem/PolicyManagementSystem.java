package collection.set.insurancemanagmentsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolicyManagementSystem {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        Policy p1 = new Policy("P001", "vinay", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy("P002", "balu", LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy("P003", "mari", LocalDate.now().plusDays(20), "Home", 7000);
        Policy p4 = new Policy("P001", "vinay Duplicate", LocalDate.now().plusDays(15), "Health", 5000); // Duplicate ID


        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);

        System.out.println("\nShowing all the Policies :");
        manager.getAllUniquePolicies();

        System.out.println("\nShowing all Health Policies");
        List<Policy> healthCovearge = manager.getPoliciesByCoverage("Health");
        healthCovearge.stream()
                .forEach(System.out::println);

        System.out.println("\nShowing all policies which will be expired on the next 30 days");
        manager.getPoliciesExpiringSoon().forEach(System.out::println);

        System.out.println("\nShowing all the Policies which are duplicates in PolicyNumber");
        manager.findDuplicatePolicies(new ArrayList<>(Arrays.asList(p1,p2,p3,p4))).forEach(System.out::println);

        System.out.println("\nPerformance Comparison:");
        manager.comparePerformance(Arrays.asList(p1, p2, p3, p4));
    }
}
