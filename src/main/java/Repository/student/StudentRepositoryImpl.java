package Repository.student;

import Model.Student;
import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentRepositoryImpl extends BaseRepositoryImpl<Student,Long> implements StudentRepository {

    public StudentRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Student> getEntityClass() {
        return Student.class;
    }

    @Override
    public boolean isExistsByUsername(String username) {
//        Session session = SessionFactorySingleton.getInstance().getCurrentSession();
//        Query<Student> query = session.createQuery("FROM student u WHERE u.username = :username", Student.class);
//        query.setParameter("username", username);
//        return query.uniqueResult() != null;
        return false;
    }
}
