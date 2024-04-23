package service.CourseOccurence;

import Repository.CourseOccurence.CourseOccurenceRepository;
import base.service.BaseServiceImpl;
import Model.CourseOccurrence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class CourseOccurenceServiceImpl extends BaseServiceImpl<CourseOccurrence,Long, CourseOccurenceRepository>implements CourseOccurenceService {

    private final SessionFactory sessionFactory;
    public CourseOccurenceServiceImpl(CourseOccurenceRepository courseOccurencerepository, SessionFactory sessionFactory) {
        super(courseOccurencerepository, sessionFactory);
        this.sessionFactory=sessionFactory;
    }
    @Override
    public Integer findUnitProfessor(Integer professorId, Integer occurrenceYear, Integer occurrenceNumber) {

        Transaction transaction=null;

        try(Session session=sessionFactory.getCurrentSession()) {
            transaction=session.beginTransaction();
            Integer result = repository.findUnitProfessor(professorId,occurrenceYear,occurrenceNumber);
            transaction.commit();
            return result ;
        } catch (Exception e) {
            if (transaction != null) {
//                    transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<String> showScores(Integer studentId, Integer occurrenceYear, Integer occurrenceNumber) {
        Transaction transaction=null;

        try(Session session=sessionFactory.getCurrentSession()) {
            transaction=session.beginTransaction();
            List<String> result = repository.showScores(studentId,occurrenceYear,occurrenceNumber);
            transaction.commit();
            return result ;
        } catch (Exception e) {
            if (transaction != null) {
//                    transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Integer findUnitStudent(Integer studentId, Integer occurrenceYear, Integer occurrenceNumber) {
        Transaction transaction=null;

        try(Session session=sessionFactory.getCurrentSession()) {
            transaction=session.beginTransaction();
            Integer result = repository.findUnitStudent(studentId,occurrenceYear,occurrenceNumber);
            transaction.commit();
            return result ;
        } catch (Exception e) {
            if (transaction != null) {
//                    transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }
}
