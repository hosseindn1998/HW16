package service.Professor;

import Model.Professor;
import Repository.Professor.ProfessorRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class ProfessorServiceImpl extends BaseServiceImpl<Professor,Long, ProfessorRepository>implements ProfessorService {

    public ProfessorServiceImpl(ProfessorRepository professorrepository, SessionFactory sessionFactory) {
        super(professorrepository, sessionFactory);
    }

}
