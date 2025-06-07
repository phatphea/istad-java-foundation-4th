package classobject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Employee {
    String name;
    int salary;
    final static int maxSalary = 1500;

    Scanner scanner = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("$#,##0.00");

    Employee(){

    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void createEmployee(){
        System.out.print("Enter name = " );
        this.name = scanner.nextLine();

        boolean isOverMaxSalary = true;
        while (true){
            System.out.print("Enter salary = ");
            this.salary = scanner.nextInt();
            if(salary>maxSalary){
                continue;
            }else {
                isOverMaxSalary = false;
                break;
            }
        }

    }

    void displaySalary(){
        System.out.println("Name = " + this.name);
        System.out.println("salary = " + format.format(this.salary));
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.createEmployee();
        emp.displaySalary();

    }
}
