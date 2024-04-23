package Repository.CourseEnrollment;

import Model.CourseEnrollment;
import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class CourseEnrollmentRepositoryImpl extends BaseRepositoryImpl<CourseEnrollment,Long> implements CourseEnrollmentRepository {

    public CourseEnrollmentRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Boolean isEnrollment(Integer studentId, Integer courseId) {
        Session session = SessionFactorySingleton.getInstance().getCurrentSession();
        String hql = "SELECT count(*) AS count FROM CourseOccurrence a LEFT JOIN CourseEnrollment b ON a.id = b.courseOccurrence.id\n" +
                "GROUP BY a.course.id,b.student.id HAVING b.student.id=?1 And a.course.id=?2";

        Query query = session.createQuery(hql);
        query.setParameter(1, studentId.longValue());
        query.setParameter(2, courseId.longValue());
        return !query.getResultList().isEmpty();
    }

    @Override
    public Boolean isCoursePassed(Integer studentId, Integer courseId) {
        Session session = SessionFactorySingleton.getInstance().getCurrentSession();
        String hql = "SELECT b.finalScore AS count FROM CourseOccurrence a LEFT JOIN CourseEnrollment b ON a.id = b.courseOccurrence.id\n" +
                "GROUP BY a.course.id,b.student.id,b.finalScore HAVING b.student.id=?1 And a.course.id=?2";

        Query query = session.createQuery(hql);
        query.setParameter(1, studentId.longValue());
        query.setParameter(2, courseId.longValue());
        List<Integer>list=query.getResultList();
        for(Integer i:list){
            if(i>=10)
                return true;
        }
        return false;
    }

    @Override
    public Class<CourseEnrollment> getEntityClass() {
        return CourseEnrollment.class;
    }

    @Override
    public Boolean isAverageMorThan18(Integer studentId, Integer occurrenceYear, Integer occurrenceNumber) {
        Session session = SessionFactorySingleton.getInstance().getCurrentSession();
        String hql1 = "SELECT b.finalScore AS count FROM CourseOccurrence a LEFT JOIN CourseEnrollment b ON a.id = b.courseOccurrence.id\n" +
                "GROUP BY a.course.id,b.student.id,a.course.unit,b.finalScore,a.occurrenceYear,a.OccurrenceNumber HAVING b.student.id=?1 And a.occurrenceYear=?2 And a.OccurrenceNumber=?3 AND b.finalScore IS NOT NULL";

        Query query1 = session.createQuery(hql1);
        query1.setParameter(1, studentId.longValue());
        query1.setParameter(2, occurrenceYear.longValue());
        query1.setParameter(3, occurrenceNumber.longValue());
        List<Integer>list1=query1.getResultList();

        OptionalDouble avg=list1.stream().mapToDouble(a->a).average();
        System.out.println(avg.getAsDouble());
        return avg.getAsDouble()>=18;
    }

}
