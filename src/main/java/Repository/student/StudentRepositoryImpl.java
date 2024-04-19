package Repository.student;

import Model.Student;
import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Optional;

public class StudentRepositoryImpl extends BaseRepositoryImpl<Student,Long> implements StudentRepository {

    public StudentRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<Student> getEntityClass() {
        return Student.class;
    }
}
