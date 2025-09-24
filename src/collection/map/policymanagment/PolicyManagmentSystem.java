package collection.map.policymanagment;

import java.time.LocalDate;

public class PolicyManagmentSystem {

    public static void main(String[] args) {
        PolicyManagment system = new PolicyManagment();

        system.addPolicy(new Policy("P001", "vinay", LocalDate.now().plusDays(10)));
        system.addPolicy(new Policy("P002", "archana", LocalDate.now().plusDays(40)));
        system.addPolicy(new Policy("P003", "ullas", LocalDate.now().plusDays(20)));
        system.addPolicy(new Policy("P004", "abhi", LocalDate.now().minusDays(5))); // expired

        System.out.println("All Policies:");
        system.showAllPolicies();

        System.out.println("\nPolicy P001: " + system.getPolicyByNumber("P001"));

        System.out.println("\nPolicies expiring in next 30 days:");
        System.out.println(system.getPoliciesExpiringIn30Days());

        System.out.println("\nPolicies for Alice:");
        System.out.println(system.getPoliciesByHolder("Alice"));

        System.out.println("\nRemoving expired policies...");
        system.removeExpiredPolicies();

        System.out.println("\nAll Policies after removal:");
        system.showAllPolicies();
    }
}
