package service.Professor;

import Model.Professor;
import Model.Student;
import Repository.Professor.ProfessorRepository;
import Repository.student.StudentRepository;
import base.service.BaseServiceImpl;

public class ProfessorServiceImpl extends BaseServiceImpl<Professor,Long, ProfessorRepository>implements ProfessorService {

    public ProfessorServiceImpl(ProfessorRepository professorrepository) {
        super(professorrepository);
    }

}
