package Repository.Professor;

import Model.Professor;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class ProfessorRepositoryImpl extends BaseRepositoryImpl<Professor,Long> implements ProfessorRepository {

    public ProfessorRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Professor> getEntityClass() {
        return Professor.class;
    }
}
