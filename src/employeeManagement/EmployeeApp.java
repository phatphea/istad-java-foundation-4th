package employeeManagement;

import employeeManagement.mapper.EmployeeMapper;
import employeeManagement.repository.EmployeeRepository;
import employeeManagement.service.EmployeeService;
import employeeManagement.service.EmployeeServiceImpl;
import employeeManagement.utils.TableUtils;
import employeeManagement.view.EmployeeView;

public class EmployeeApp {

    private void run(){
        EmployeeRepository repository = new EmployeeRepository();
        EmployeeMapper mapper = new EmployeeMapper();
        EmployeeService service = new EmployeeServiceImpl(repository, mapper);
        EmployeeView view = new EmployeeView(service);
        view.start();
    };

    public static void main(String[] args) {

        EmployeeApp app = new EmployeeApp();
        app.run();


    }

}
