package oopsimplementation.employeesalarycalculation;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private int salaryPerHour;

    public PartTimeEmployee(int employeeId, String employeeName, int hoursWorked, int salaryPerHour) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.salaryPerHour = salaryPerHour;
    }


    @Override
    double calculateSalary() {
        return hoursWorked * salaryPerHour;
    }
}