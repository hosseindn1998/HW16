package Repository.CourseOccurence;

import Model.CourseOccurrence;
import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.type.StandardBasicTypes;

import java.util.List;
import java.util.Objects;

public class CourseOccurenceRepositoryImpl extends BaseRepositoryImpl<CourseOccurrence,Long> implements CourseOccurenceRepository {

    private final SessionFactory sessionFactory;

    public CourseOccurenceRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
        this.sessionFactory=sessionFactory;
    }
    @Override
    public Integer findUnitProfessor(Integer professorId, Integer occurrenceYear, Integer occurrenceNumber) {
        Session session = SessionFactorySingleton.getInstance().getCurrentSession();
        String hql = "SELECT sum(b.unit) AS total_unit FROM CourseOccurrence a LEFT JOIN Course b ON a.course.id = b.id\n" +
                " GROUP BY a.professor.id,a.occurrenceYear,a.OccurrenceNumber HAVING a.professor.id=?1 AND a.occurrenceYear=?2 And a.OccurrenceNumber=?3";

        Query query = session.createQuery(hql);
        query.setParameter(1, professorId.longValue());
        query.setParameter(2, occurrenceYear.longValue());
        query.setParameter(3, occurrenceNumber.longValue());


        return Integer.valueOf(query.getResultList().get(0).toString());

    }

    @Override
    public Integer findUnitStudent(Integer studentId, Integer occurrenceYear, Integer occurrenceNumber) {
        Session session = SessionFactorySingleton.getInstance().getCurrentSession();
        String hql = "SELECT sum(a.course.unit) AS total_unit FROM CourseOccurrence a LEFT JOIN CourseEnrollment b ON a.id = b.courseOccurrence.id\n" +
                "GROUP BY b.student.id,a.occurrenceYear,a.OccurrenceNumber HAVING b.student.id=?1 AND a.occurrenceYear=?2 And a.OccurrenceNumber=?3";

        Query query = session.createQuery(hql);
        query.setParameter(1, studentId.longValue());
        query.setParameter(2, occurrenceYear.longValue());
        query.setParameter(3, occurrenceNumber.longValue());


        return Integer.valueOf(query.getResultList().get(0).toString());
    }
    @Override
    public List<String> showScores(Integer studentId, Integer occurrenceYear, Integer occurrenceNumber) {
        Session session = SessionFactorySingleton.getInstance().getCurrentSession();
        String hql = "SELECT a.course.courseName,a.course.unit,b.finalScore AS total_unit FROM CourseOccurrence a LEFT JOIN CourseEnrollment b ON a.id = b.courseOccurrence.id\n" +
                "GROUP BY b.student.id,a.occurrenceYear,a.OccurrenceNumber,a.course.courseName,a.course.unit,b.finalScore HAVING b.student.id=?1 AND a.occurrenceYear=?2 And a.OccurrenceNumber=?3";

        Query query = session.createQuery(hql);
        query.setParameter(1, studentId.longValue());
        query.setParameter(2, occurrenceYear.longValue());
        query.setParameter(3, occurrenceNumber.longValue());
        List<String> results=query.getResultList();


        return results;
    }

    @Override
    public Class<CourseOccurrence> getEntityClass() {
        return CourseOccurrence.class;
    }
}
