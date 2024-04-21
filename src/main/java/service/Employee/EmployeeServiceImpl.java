package service.Employee;

import Model.Employee;
import Repository.Employee.EmployeeRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class EmployeeServiceImpl extends BaseServiceImpl<Employee,Long,EmployeeRepository>implements EmployeeService {

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, SessionFactory sessionFactory) {
        super(employeeRepository, sessionFactory);
    }

}
