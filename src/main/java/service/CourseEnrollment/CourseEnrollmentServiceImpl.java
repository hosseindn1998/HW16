package service.CourseEnrollment;

import Model.CourseEnrollment;
import Model.Student;
import Repository.CourseEnrollment.CourseEnrollmentRepository;
import base.exception.NotFoundException;
import base.service.BaseServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CourseEnrollmentServiceImpl extends BaseServiceImpl<CourseEnrollment,Long, CourseEnrollmentRepository>implements CourseEnrollmentService {
    private final SessionFactory sessionFactory;

    public CourseEnrollmentServiceImpl(CourseEnrollmentRepository courseenrollmentrepository, SessionFactory sessionFactory) {
        super(courseenrollmentrepository, sessionFactory);
        this.sessionFactory=sessionFactory;
    }

    @Override
    public Boolean isCoursePassed(Integer studentId, Integer courseId) {
        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            Boolean result=repository.isCoursePassed(studentId,courseId);
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            throw new NotFoundException(String.format("entity with %s not found", studentId));
        }
    }


    @Override
    public Boolean isEnrollment(Integer studentId, Integer courseId) {
        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            Boolean result=repository.isEnrollment(studentId,courseId);
            session.getTransaction().commit();
            return result;
        } catch (Exception e) {
            throw new NotFoundException(String.format("entity with %s not found", studentId));
        }
    }
}
