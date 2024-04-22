package Repository.CourseEnrollment;

import Model.CourseEnrollment;
import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

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

}
