package Repository.Professor;

import Model.Professor;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class ProfessorRepositoryImpl extends BaseRepositoryImpl<Professor,Long> implements ProfessorRepository {

    public ProfessorRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<Professor> getEntityClass() {
        return Professor.class;
    }
}
