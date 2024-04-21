package service.student;

import Model.Student;
import base.entity.BaseEntity;
import base.service.BaseService;

import java.util.List;

public interface StudentService extends BaseService<Student,Long> {
    Boolean isExistsByUsername(String username);
    Student authentication(String username,String password);
}
