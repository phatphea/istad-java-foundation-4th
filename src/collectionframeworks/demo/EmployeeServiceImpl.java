package collectionframeworks.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    static List<Employee> employees = new ArrayList<>(){{
        add(new Employee(1L, "Ranuth", 400.0));
        add(new Employee(2L, "Phea", 400.0));
        add(new Employee(3L, "Thona", 400.0));
    }};

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        for(Employee employee : employees){
            if(employee.getId().equals(id)){
                return employee;
            }
        }
        return null;
    }

}
