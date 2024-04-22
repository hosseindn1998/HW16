package service.Employee;

import Model.Employee;
import Model.Student;
import base.service.BaseService;

public interface EmployeeService extends BaseService<Employee,Long> {
     Employee authentication(String username,String password);

}
