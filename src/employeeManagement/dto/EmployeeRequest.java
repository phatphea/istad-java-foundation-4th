package employeeManagement.dto;

public record EmployeeRequest(

        String name,
        String email,
        Double salary

) {
}
