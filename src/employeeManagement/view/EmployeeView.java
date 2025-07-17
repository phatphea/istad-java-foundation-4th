package employeeManagement.view;

import employeeManagement.dto.EmployeeRequest;
import employeeManagement.mapper.EmployeeMapper;
import employeeManagement.repository.EmployeeRepository;
import employeeManagement.service.EmployeeService;
import employeeManagement.service.EmployeeServiceImpl;
import employeeManagement.utils.TableUtils;

import java.util.Scanner;

public class EmployeeView {

    private final static Scanner scanner = new Scanner(System.in);
    private final static TableUtils tableUtils = new TableUtils();

    private final EmployeeService employeeService;

    public EmployeeView(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    private void label(){

    }

    private void showMenu(){
        System.out.println("=========| Employee Management |=========");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee by ID");
        System.out.println("3. Delete Employee by ID");
        System.out.println("4. Get all Employees");
        System.out.println("5. Get Employee by Id");
        System.out.println("0. Exit Program");
    }

    public void start(){
        int option;
        while (true){
            showMenu();
            System.out.print("Enter the option -> ");
            option = Integer.parseInt(scanner.nextLine());

            if(option == 0) System.exit(0);

            switch (option){
                case 1 -> addEmployee();
                case 2 -> updateEmployee();
                case 3 -> deleteEmployee();
                case 4 -> getAllEmployees();
                case 5 -> getEmployeeById();
                default -> System.out.println("Invalid option!");
            }
        }
    }

    private void addEmployee(){
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee email: ");
        String email = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        Double salary = Double.parseDouble(scanner.nextLine());
        EmployeeRequest request = new EmployeeRequest(
                name, email, salary
        );

        System.out.println(tableUtils.renderEmployee(
                employeeService.create(request)
        ));
    }

    private void updateEmployee(){

    }

    private void deleteEmployee(){

    }

    private void getAllEmployees(){

    }

    private void getEmployeeById(){

    }
}
