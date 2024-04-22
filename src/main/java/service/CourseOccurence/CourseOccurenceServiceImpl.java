package service.CourseOccurence;

import Repository.CourseOccurence.CourseOccurenceRepository;
import base.service.BaseServiceImpl;
import Model.CourseOccurrence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CourseOccurenceServiceImpl extends BaseServiceImpl<CourseOccurrence,Long, CourseOccurenceRepository>implements CourseOccurenceService {

    private final SessionFactory sessionFactory;
    public CourseOccurenceServiceImpl(CourseOccurenceRepository courseOccurencerepository, SessionFactory sessionFactory) {
        super(courseOccurencerepository, sessionFactory);
        this.sessionFactory=sessionFactory;
    }
    @Override
    public Integer findUnit(Integer professorId) {

        Transaction transaction=null;

        try(Session session=sessionFactory.getCurrentSession()) {
            transaction=session.beginTransaction();
            Integer result = repository.findUnit(professorId);
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
