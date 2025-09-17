package oopsimplementation.employeesalarycalculation;

public class ContractorEmployee extends Employee{

    double contractAmount ;

    public ContractorEmployee(int employeeId, String employeeName, double contractAMount) {
        super(employeeId, employeeName);
        this.contractAmount = contractAmount;
    }

    @Override
    double calculateSalary() {
        return contractAmount;
    }
}
