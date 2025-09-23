package collection.arraylist.policymanagment;

public class Policy {

    private int policyNumber;
    private String holderName;
    private String insuranceType;
    private double coverageAmount;

    public Policy(int policyNumber, String holderName, String insuranceType, double coverageAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.insuranceType = insuranceType;
        this.coverageAmount = coverageAmount;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                ", coverageAmount=" + coverageAmount +
                '}';
    }
}
