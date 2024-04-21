package Repository.CourseEnrollment;

import Model.CourseEnrollment;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class CourseEnrollmentRepositoryImpl extends BaseRepositoryImpl<CourseEnrollment,Long> implements CourseEnrollmentRepository {

    public CourseEnrollmentRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<CourseEnrollment> getEntityClass() {
        return CourseEnrollment.class;
    }
}
