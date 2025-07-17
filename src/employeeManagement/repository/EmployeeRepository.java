package employeeManagement.repository;

import employeeManagement.model.Employee;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class EmployeeRepository {

    public List<Employee> employees;

    public EmployeeRepository(){
        employees = new ArrayList<>();
        initializeData();
    }

    private void initializeData() {
        employees.add(new Employee("John Smith", "john.smith@example.com", 75000.00));
        employees.add(new Employee("Emma Johnson", "emma.johnson@example.com", 82000.00));
        employees.add(new Employee("Michael Chen", "michael.chen@example.com", 65000.00));
        employees.add(new Employee("Sarah Davis", "sarah.davis@example.com", 90000.00));
        employees.add(new Employee("David Wilson", "david.wilson@example.com", 70000.00));
        employees.add(new Employee("Laura Martinez", "laura.martinez@example.com", 78000.00));
        employees.add(new Employee("James Brown", "james.brown@example.com", 85000.00));
        employees.add(new Employee("Emily Taylor", "emily.taylor@example.com", 72000.00));
        employees.add(new Employee("Robert Lee", "robert.lee@example.com", 95000.00));
        employees.add(new Employee("Sophie Clark", "sophie.clark@example.com", 68000.00));
        employees.add(new Employee("William Harris", "william.harris@example.com", 80000.00));
        employees.add(new Employee("Olivia Lewis", "olivia.lewis@example.com", 74000.00));
        employees.add(new Employee("Thomas Walker", "thomas.walker@example.com", 88000.00));
        employees.add(new Employee("Ava King", "ava.king@example.com", 71000.00));
        employees.add(new Employee("Daniel Scott", "daniel.scott@example.com", 92000.00));
        employees.add(new Employee("Mia Adams", "mia.adams@example.com", 69000.00));
        employees.add(new Employee("Henry Green", "henry.green@example.com", 83000.00));
        employees.add(new Employee("Charlotte Baker", "charlotte.baker@example.com", 76000.00));
        employees.add(new Employee("Liam Gonzalez", "liam.gonzalez@example.com", 87000.00));
        employees.add(new Employee("Amelia Wright", "amelia.wright@example.com", 73000.00));
    }


}
