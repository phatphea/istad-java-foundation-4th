package employeeManagement.service;

import employeeManagement.dto.EmployeeRequest;
import employeeManagement.dto.EmployeeResponse;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    EmployeeResponse create(EmployeeRequest request);

    List<EmployeeResponse> getAllEmployees();

    Optional<EmployeeResponse> getEmployeeById(String id);

    Optional<EmployeeResponse> updateEmployeeById(String id, EmployeeRequest request);

    boolean deleteEmployeeById(String id);

}
