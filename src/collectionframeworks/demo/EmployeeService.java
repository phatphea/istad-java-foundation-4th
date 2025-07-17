package collectionframeworks.demo;

import collectionframeworks.list.LinkedListDemo;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    Employee getEmployeeById(Long id);

}
