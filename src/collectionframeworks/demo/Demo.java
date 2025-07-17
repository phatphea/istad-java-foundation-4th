package collectionframeworks.demo;

import java.util.List;

public class Demo {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeServiceImpl();

        List<Employee> existEmployee = employeeService.getAll();
        for(Employee emp : existEmployee){
            System.out.println("=================");
            System.out.println("Id: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
        }

        Employee empFound = employeeService.getEmployeeById(1L);
        System.out.println("=================");
        System.out.println("Id: " + empFound.getId());
        System.out.println("Name: " + empFound.getName());
        System.out.println("Salary: " + empFound.getSalary());


    }
}
