package filehandling.employeemanagementsystem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeManager {


        String path = "C:\\Users\\sujatha\\IdeaProjects\\fundamentals\\src\\filehandling\\employeemanagementsystem\\employee.json";

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        private List<Employee> readEmployees() {
            try (Reader reader = new FileReader(path)) {
                Type listType = new TypeToken<List<Employee>>() {}.getType();
                List<Employee> employees = gson.fromJson(reader, listType);
                return employees != null ? employees : new ArrayList<>();
            } catch (IOException e) {
                return new ArrayList<>();
            }
        }


        private void writeEmploee(List<Employee> employeesList) throws IOException{

            try(FileWriter writer = new FileWriter(path)){

                gson.toJson(employeesList,writer);
            }
        }

        public void addEmployee(Employee employee) throws IOException {

            List<Employee> employees = readEmployees();

            boolean exist = employees.stream().anyMatch(e -> e.getEmployeeId() == employee.getEmployeeId());

            if(exist){
                System.out.println("Employee ID already exists!");
                return;
            }
            employees.add(employee);
            writeEmploee(employees);
            System.out.println(" Employee added successfully!");

        }

        public void display(){

            List<Employee> employees = readEmployees();

            if(employees.isEmpty())
                System.out.println("NO EMPLOYEE FOUND");
            else{
                employees.forEach(System.out::println);
            }

        }

        public void updateEmployee(int id , Employee employee) throws  IOException{

            List<Employee> employees = readEmployees();

            boolean makeChange = false;

            Employee matchedEmployee = employees.stream()
                    .filter(e -> e.getEmployeeId() == id)
                    .findAny().get();

            if(matchedEmployee != null){
                matchedEmployee.setName(employee.getName());
                matchedEmployee.setAddress(employee.getAddress());
                matchedEmployee.setDepartment(employee.getDepartment());
                matchedEmployee.setProjects(employee.getProjects());

                makeChange = true;
            }

            if(makeChange){
                System.out.println("Employee Successfully Updated");
                writeEmploee(employees);
            } else{
                System.out.println("Employee not found!");
            }
        }

        public void deleteEmployee(int id) throws IOException{
            List<Employee> employees = readEmployees();

            Employee matchedEmployee = employees.stream()
                    .filter(e -> e.getEmployeeId() == id)
                    .findAny()
                    .get();

            employees.remove(matchedEmployee);

            writeEmploee(employees);
        }

        public void searchEmployee(int id){
            List<Employee> employees = readEmployees();

            employees.stream()
                    .filter(e-> e.getEmployeeId() == id)
                    .findFirst()
                    .ifPresentOrElse(System.out::println,
            () -> System.out.println("Employee not Found "));
        }





}
