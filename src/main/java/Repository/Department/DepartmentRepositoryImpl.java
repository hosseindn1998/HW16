package Repository.Department;

import Model.Department;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class DepartmentRepositoryImpl extends BaseRepositoryImpl<Department,Long> implements DepartmentRepository {

    public DepartmentRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Department> getEntityClass() {
        return Department.class;
    }
}
