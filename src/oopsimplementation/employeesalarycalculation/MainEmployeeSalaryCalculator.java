package oopsimplementation.employeesalarycalculation;

public class MainEmployeeSalaryCalculator {
    public static void main(String[] args) {

        // For the Full Time Employee\
        Employee fullTimeEmployee = new FullTimeEmployee(101,"vinay",55000);
        double salaryOfTheFullTimeEmployee = fullTimeEmployee.calculateSalary();
        System.out.println(fullTimeEmployee);
        System.out.println("Salary of the Full Time Employee is "+salaryOfTheFullTimeEmployee);


        // For the Part Time Employee\
        Employee partTimeEmployee = new PartTimeEmployee(102,"Vinay",5,2300);
        double salaryOfThePartTimeEmployee = partTimeEmployee.calculateSalary();
        System.out.println(partTimeEmployee);
        System.out.println("Salary of the part Time Employee is "+salaryOfThePartTimeEmployee);


        // For the Contract Employee\
        Employee contractEmployee = new ContractorEmployee(103,"vinay",50000);
        double salaryOfTheContractEmployee = contractEmployee.calculateSalary();
        System.out.println(contractEmployee);
        System.out.println("Salary of the Contract Employee is "+salaryOfTheContractEmployee);

    }
}
