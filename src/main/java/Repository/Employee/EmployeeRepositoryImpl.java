package Repository.Employee;

import Model.Employee;
import Model.Student;
import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeRepositoryImpl extends BaseRepositoryImpl<Employee,Long> implements EmployeeRepository {

    public EmployeeRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Employee> getEntityClass() {
        return Employee.class;
    }
    @Override
    public Employee authentication(String username, String password) {
        Session session = SessionFactorySingleton.getInstance().getCurrentSession();
        return session.createQuery("FROM Employee e WHERE e.username= :username AND e.password = :password", Employee.class)
                .setParameter("username", username)
                .setParameter("password", password)
                .uniqueResult();
    }
}
