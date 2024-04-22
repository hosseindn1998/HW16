package Repository.Professor;

import Model.Professor;
import Model.Student;
import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProfessorRepositoryImpl extends BaseRepositoryImpl<Professor,Long> implements ProfessorRepository {

    public ProfessorRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Professor> getEntityClass() {
        return Professor.class;
    }
    @Override
    public Professor authentication(String username, String password) {
        Session session = SessionFactorySingleton.getInstance().getCurrentSession();
        return session.createQuery("FROM Professor p WHERE p.username= :username AND p.password = :password", Professor.class)
                .setParameter("username", username)
                .setParameter("password", password)
                .uniqueResult();
    }
}
