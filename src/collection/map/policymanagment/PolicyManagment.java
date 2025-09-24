package collection.map.policymanagment;
import java.time.LocalDate;
import java.util.*;

public class PolicyManagment {

    private Map<String, Policy> policyMap = new HashMap<>();
    private Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> expiryMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicyMap.put(policy.getPolicyNumber(), policy);

        expiryMap.putIfAbsent(policy.getExpiryDate(), new ArrayList<>());
        expiryMap.get(policy.getExpiryDate()).add(policy);
    }

    // Retrieve by policy number
    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List policies expiring in next 30 days
    public List<Policy> getPoliciesExpiringIn30Days() {

        LocalDate today = LocalDate.now();
        LocalDate expiry = today.plusDays(30);

        List<Policy> result = new ArrayList<>();

        expiryMap.subMap(today,false,expiry,true)
                .values()
                .forEach(result::addAll);

        return result;
    }

    // List policies by policyholder
    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : policyMap.values()) {
            if (p.getPolicyHolderName().equalsIgnoreCase(holderName)) {
                result.add(p);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> it = policyMap.entrySet().iterator();
        while (it.hasNext()) {
            Policy policy = it.next().getValue();
            if (policy.getExpiryDate().isBefore(today)) {
                it.remove(); // remove from HashMap
                orderedPolicyMap.remove(policy.getPolicyNumber()); // remove from LinkedHashMap
                expiryMap.get(policy.getExpiryDate()).remove(policy); // remove from TreeMap
            }
        }
    }

    // Show all policies in insertion order
    public void showAllPolicies() {
        for (Policy p : orderedPolicyMap.values()) {
            System.out.println(p);
        }
    }

}
