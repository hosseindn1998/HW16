package Repository.Employee;

import Model.Employee;
import Model.Student;
import base.repository.BaseRepository;

public interface EmployeeRepository extends BaseRepository<Employee,Long> {
    Employee authentication(String username,String password);

}
