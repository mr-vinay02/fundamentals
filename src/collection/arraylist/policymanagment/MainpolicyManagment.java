package collection.arraylist.policymanagment;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainpolicyManagment {
    public static  void main(String[] args) {

        PolicyManagment polices = new PolicyManagment();

        Collections.addAll(polices.policyList,
                new Policy(101, "ullas", "life", 46000),
                new Policy(102, "vinay", "Health", 550000),
                new Policy(103, "archana", "Health", 500000),
                new Policy(104, "abhi", "auto", 100000)
        );


        System.out.println("All the Policies Which company Has!");
        polices.showPolicies();

        System.out.println("Company Adding a new Policy");
        polices.createPolicy(new Policy(105,"vijay","Life",450000));

        polices.showPolicies();

        System.out.println("Company updating the policies");
        polices.updatePolicy(new Policy(105,"vijay","Life",555555));

        System.out.println("Updated Policies :");
        Policy updatedPolicy = polices.getByPolicyNumber(105);
        System.out.println(updatedPolicy);

    }
}
