package service.Department;

import Model.Department;
import Repository.Department.DepartmentRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class DepartmentServiceImpl extends BaseServiceImpl<Department,Long,DepartmentRepository>implements DepartmentService {

    public DepartmentServiceImpl(DepartmentRepository departmentrepository, SessionFactory sessionFactory) {
        super(departmentrepository, sessionFactory);
    }

}
