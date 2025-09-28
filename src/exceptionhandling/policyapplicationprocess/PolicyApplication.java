package exceptionhandling.policyapplicationprocess;

public class PolicyApplication {

    private int age;
    private boolean hasAccidents;
    private boolean hasHealthIssues;

    public PolicyApplication(int age, boolean hasAccidents, boolean hasHealthIssues) {
        this.age = age;
        this.hasAccidents = hasAccidents;
        this.hasHealthIssues = hasHealthIssues;
    }

    // validate age
    public void validateAge(int age) throws InvalidAgeException
    {
        if(age < 18)
            throw new InvalidAgeException("Invalid Age: Applicants must be between 18 and 70.");
    }

    //  validate driving records
    public void validateDriving(boolean hasAccidents) throws PoorDrivingRecordException
    {
        if(hasAccidents)
            throw new PoorDrivingRecordException("Poor Driving Record: Too many accidents reported.");
    }

    // Validate health records
    public void validateHealth() throws HealthIssueException {
        if (hasHealthIssues) {
            throw new HealthIssueException("Health Issue: Applicant has disqualifying health conditions.");
        }
    }

}
