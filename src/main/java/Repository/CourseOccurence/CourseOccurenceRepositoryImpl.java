package Repository.CourseOccurence;

import Model.CourseOccurrence;
import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class CourseOccurenceRepositoryImpl extends BaseRepositoryImpl<CourseOccurrence,Long> implements CourseOccurenceRepository {

    private final SessionFactory sessionFactory;

    public CourseOccurenceRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
        this.sessionFactory=sessionFactory;
    }
    @Override
    public Integer findUnit(Integer professorId) {
        Session session = SessionFactorySingleton.getInstance().getCurrentSession();
        String hql = "SELECT sum(b.unit) AS total_unit FROM CourseOccurrence a LEFT JOIN Course b ON a.course.id = b.id\n" +
                "GROUP BY a.professor.id HAVING a.professor.id=?1";

        Query query = session.createQuery(hql);
        query.setParameter(1, professorId.longValue());

        return Integer.valueOf(query.getResultList().get(0).toString());

    }

    @Override
    public Class<CourseOccurrence> getEntityClass() {
        return CourseOccurrence.class;
    }
}
