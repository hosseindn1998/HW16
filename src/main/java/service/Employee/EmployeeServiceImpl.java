package service.Employee;

import Model.Employee;
import Model.Student;
import Repository.Employee.EmployeeRepository;
import base.service.BaseServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeServiceImpl extends BaseServiceImpl<Employee,Long,EmployeeRepository>implements EmployeeService {
    private final SessionFactory sessionFactory;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, SessionFactory sessionFactory) {
        super(employeeRepository, sessionFactory);
        this.sessionFactory=sessionFactory;

    }
    @Override
    public Employee authentication(String username, String password) {
        Transaction transaction=null;

        try(Session session=sessionFactory.getCurrentSession()) {
            transaction=session.beginTransaction();
            Employee employee = repository.authentication(username, password);
            transaction.commit();
            return employee ;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }

    }

}
