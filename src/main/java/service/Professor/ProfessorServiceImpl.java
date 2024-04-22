package service.Professor;

import Model.Professor;
import Model.Student;
import Repository.Professor.ProfessorRepository;
import base.service.BaseServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProfessorServiceImpl extends BaseServiceImpl<Professor,Long, ProfessorRepository>implements ProfessorService {

    private final SessionFactory sessionFactory;
    public ProfessorServiceImpl(ProfessorRepository professorrepository, SessionFactory sessionFactory) {
        super(professorrepository, sessionFactory);
        this.sessionFactory=sessionFactory;
    }
    @Override
    public Professor authentication(String username, String password) {
        Transaction transaction=null;

        try(Session session=sessionFactory.getCurrentSession()) {
            transaction=session.beginTransaction();
            Professor professor = repository.authentication(username, password);
            transaction.commit();
            return professor ;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

}
