package employeeManagement.utils;

import employeeManagement.dto.EmployeeResponse;
import employeeManagement.model.Employee;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import javax.swing.table.TableColumn;
import java.util.List;

public class TableUtils {

    public String renderEmployeeList(List<EmployeeResponse> employees){
        Table table = new Table(
                4,
                BorderStyle.UNICODE_BOX_DOUBLE_BORDER
        );

        table.addCell("ID");
        table.addCell("Name");
        table.addCell("Email");
        table.addCell("Salary");

        employees.forEach(employee -> {
            table.addCell(employee.id());
            table.addCell(employee.name());
            table.addCell(employee.email());
            table.addCell(employee.salary().toString());
        });

        return table.render();
    }

    public String renderEmployee(EmployeeResponse employee){
        Table table = new Table(
                2,
                BorderStyle.HEAVY_TOP_AND_BOTTOM
        );

//        table.addCell("\tEmployee Details\t");
        table.addCell("ID");
        table.addCell(employee.id());
        table.addCell("Name");
        table.addCell(employee.name());
        table.addCell("Email");
        table.addCell(employee.email());
        table.addCell("Salary");
        table.addCell(employee.salary().toString());

        return table.render();
    }

}
