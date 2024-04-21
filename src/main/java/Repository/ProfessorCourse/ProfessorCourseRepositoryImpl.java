package Repository.ProfessorCourse;

import Model.ProfessorCourse;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class ProfessorCourseRepositoryImpl extends BaseRepositoryImpl<ProfessorCourse,Long> implements ProfessorCourseRepository {

    public ProfessorCourseRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<ProfessorCourse> getEntityClass() {
        return ProfessorCourse.class;
    }
}
