package service.AssistantProfessor;

import Model.AssistantProfessor;
import Repository.AssistantProfessor.AssistantProfessorRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class AssistantProfessorServiceImpl extends BaseServiceImpl<AssistantProfessor,Long, AssistantProfessorRepository>implements AssistantProfessorService {

    public AssistantProfessorServiceImpl(AssistantProfessorRepository assistantprofessorrepository, SessionFactory sessionFactory) {
        super(assistantprofessorrepository, sessionFactory);
    }

}
