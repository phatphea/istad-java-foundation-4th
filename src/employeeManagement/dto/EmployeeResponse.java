package employeeManagement.dto;

import lombok.Builder;

@Builder
public record EmployeeResponse(

        String id,
        String name,
        String email,
        Double salary

) {
}
