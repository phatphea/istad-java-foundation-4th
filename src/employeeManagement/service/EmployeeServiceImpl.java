package employeeManagement.service;

import employeeManagement.dto.EmployeeRequest;
import employeeManagement.dto.EmployeeResponse;
import employeeManagement.mapper.EmployeeMapper;
import employeeManagement.model.Employee;
import employeeManagement.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository repository;
    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeRepository repository, EmployeeMapper employeeMapper) {
        this.repository = repository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public EmployeeResponse create(EmployeeRequest request) {

        Employee employee = employeeMapper.fromRequest(request);

        repository.getEmployees().add(employee);

        return employeeMapper.toResponse(employee);
    }

    @Override
    public List<EmployeeResponse> getAllEmployees() {
        return employeeMapper.toResponseList(repository.getEmployees());
    }

    @Override
    public Optional<EmployeeResponse> getEmployeeById(String id) {
        return repository.getEmployees().stream()
                .filter(employee -> employee.getId().equals(id))
                .map(employee -> EmployeeResponse.builder()
                        .id(employee.getId())
                        .name(employee.getName())
                        .email(employee.getEmail())
                        .salary(employee.getSalary())
                        .build()
                )
                .findFirst();
    }

    @Override
    public Optional<EmployeeResponse> updateEmployeeById(String id, EmployeeRequest request) {
        return repository.getEmployees().stream()
                .filter(employee -> employee.getId().equals(id))
                .map(employee -> {
                    employee.setName(request.name());
                    employee.setEmail(request.email());
                    employee.setSalary(request.salary());
                    return employeeMapper.toResponse(employee);
                })
                .findFirst();
    }

    @Override
    public boolean deleteEmployeeById(String id) {
        return repository.getEmployees().removeIf(employee -> employee.getId().equals(id));
    }
}
