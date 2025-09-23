package collection.arraylist.policymanagment;

import java.util.ArrayList;
import java.util.List;

public class PolicyManagment {

    ArrayList<Policy> policyList = new ArrayList<>();

    public void createPolicy(Policy policy)
    {
        policyList.add(policy);
    }

    public void updatePolicy(Policy policy)
    {
        Policy updatedPolicy = null;
        for (Policy policy1 : policyList) {
            if(policy1.getPolicyNumber() == policy.getPolicyNumber())
            {
                updatedPolicy = policy1;
            }
        }
        updatedPolicy.setCoverageAmount(policy.getCoverageAmount());
        updatedPolicy.setInsuranceType(policy.getInsuranceType());
        updatedPolicy.setInsuranceType(policy.getInsuranceType());
    }

    public Policy getByPolicyNumber(int policyNumber)
    {
        for (Policy policy : policyList) {
            if(policy.getPolicyNumber() == policyNumber)
                return policy;
        }
        return null;
    }

    public void showPolicies()
    {
        for (Policy policy : policyList) {
            System.out.println(policy);
        }
    }
}
