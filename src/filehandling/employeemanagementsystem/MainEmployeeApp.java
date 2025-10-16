package filehandling.employeemanagementsystem;

import java.io.IOException;
import java.util.*;

public class MainEmployeeApp {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n==== Employee Management System ====");
            System.out.println("1. Add New Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Street: ");
                    String street = sc.nextLine();
                    System.out.print("Enter City: ");
                    String city = sc.nextLine();
                    System.out.print("Enter Zipcode: ");
                    String zip = sc.nextLine();

                    Address address = new Address(street, city, zip);
                    List<Project> projects = new ArrayList<>();

                    System.out.print("How many projects? ");
                    int count = sc.nextInt(); sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter Project ID: ");
                        int pid = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter Project Name: ");
                        String pname = sc.nextLine();
                        System.out.print("Enter Status: ");
                        String status = sc.nextLine();
                        projects.add(new Project(pid, pname, status));
                    }

                    manager.addEmployee(new Employee(id, name, dept, address, projects));
                }

                case 2 -> manager.display();

                case 3 -> {
                    System.out.print("Enter Employee ID to update: ");
                    int uid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter New Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter New Street: ");
                    String street = sc.nextLine();
                    System.out.print("Enter New City: ");
                    String city = sc.nextLine();
                    System.out.print("Enter New Zipcode: ");
                    String zip = sc.nextLine();

                    Address addr = new Address(street, city, zip);
                    List<Project> projList = new ArrayList<>();
                    System.out.print("How many projects to update? ");
                    int pc = sc.nextInt(); sc.nextLine();
                    for (int i = 0; i < pc; i++) {
                        System.out.print("Enter Project ID: ");
                        int pid = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter Project Name: ");
                        String pname = sc.nextLine();
                        System.out.print("Enter Status: ");
                        String status = sc.nextLine();
                        projList.add(new Project(pid, pname, status));
                    }
                    manager.updateEmployee(uid, new Employee(uid, name, dept, addr, projList));
                }

                case 4 -> {
                    System.out.print("Enter Employee ID to delete: ");
                    int did = sc.nextInt();
                    manager.deleteEmployee(did);
                }

                case 5 -> {
                    System.out.print("Enter Employee ID to search: ");
                    int sid = sc.nextInt();
                    manager.searchEmployee(sid);
                }

                case 6 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

