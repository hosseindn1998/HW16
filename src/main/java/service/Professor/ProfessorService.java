package service.Professor;

import Model.Professor;
import Model.Student;
import base.service.BaseService;

public interface ProfessorService extends BaseService<Professor,Long> {
    Professor authentication(String username,String password);
}
