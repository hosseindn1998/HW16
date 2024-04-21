package Repository.Employee;

import Model.Employee;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class EmployeeRepositoryImpl extends BaseRepositoryImpl<Employee,Long> implements EmployeeRepository {

    public EmployeeRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Employee> getEntityClass() {
        return Employee.class;
    }
}
