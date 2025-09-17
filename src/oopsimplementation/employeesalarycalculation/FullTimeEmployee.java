package oopsimplementation.employeesalarycalculation;

public class FullTimeEmployee extends Employee {

    int salary ;

    public FullTimeEmployee(int id ,String name,int salary) {
        super(id,name);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}
