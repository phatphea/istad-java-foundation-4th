package employeeManagement.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {

    private String id;
    private String name;
    private String email;
    private Double salary;

    public Employee(String name, String email, Double salary){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

}
