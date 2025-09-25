package collection.set.insurancemanagmentsystem;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PolicyManager {

    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    // Added the Policy to the  All 3 types of the Set
    public void addPolicy(Policy policy)
    {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
        System.out.println("Policy Successfully Added....");
    }

    // print all the policy in the linked hash set
    public void getAllUniquePolicies()
    {
        linkedHashSet.stream()
                .forEach(System.out::println);
    }

    // gives the policy which will be expired in next 30 days
    public List<Policy> getPoliciesExpiringSoon()
    {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = LocalDate.now().plusDays(30);
        return treeSet.stream()
                .filter(policy -> !policy.getExpiryDate().isBefore(today) && !policy.getExpiryDate().isAfter(next30Days))
                .collect(Collectors.toList());
    }

    // gives the policies based on the Coverage type
    public List<Policy> getPoliciesByCoverage(String coverage)
    {
        return linkedHashSet.stream()
                .filter(policy -> coverage.equalsIgnoreCase(policy.getCoverageType()))
                .collect(Collectors.toList());
    }

    // Find duplicate policies (by policy number)
    public List<Policy> findDuplicatePolicies(List<Policy> allPolicies) {
        Set<String> seen = new HashSet<>();
        return allPolicies.stream()
                .filter(p -> !seen.add(p.getPolicyNumber())) // already seen → duplicate
                .collect(Collectors.toList());
    }


    // Performance Comparison
    public void comparePerformance(List<Policy> policies) {
        long start, end;

        // HashSet
        Set<Policy> hs = new HashSet<>();
        start = System.nanoTime();
        hs.addAll(policies);
        end = System.nanoTime();
        System.out.println("HashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        hs.contains(policies.get(0));
        end = System.nanoTime();
        System.out.println("HashSet Lookup: " + (end - start) + " ns");

        // LinkedHashSet
        Set<Policy> lhs = new LinkedHashSet<>();
        start = System.nanoTime();
        lhs.addAll(policies);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        lhs.contains(policies.get(0));
        end = System.nanoTime();
        System.out.println("LinkedHashSet Lookup: " + (end - start) + " ns");

        // TreeSet
        Set<Policy> ts = new TreeSet<>();
        start = System.nanoTime();
        ts.addAll(policies);
        end = System.nanoTime();
        System.out.println("TreeSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        ts.contains(policies.get(0));
        end = System.nanoTime();
        System.out.println("TreeSet Lookup: " + (end - start) + " ns");
    }
}
