package Repository.AssistantProfessor;

import Model.AssistantProfessor;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class AssistantProfessorRepositoryImpl extends BaseRepositoryImpl<AssistantProfessor,Long> implements AssistantProfessorRepository {

    public AssistantProfessorRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<AssistantProfessor> getEntityClass() {
        return AssistantProfessor.class;
    }
}
