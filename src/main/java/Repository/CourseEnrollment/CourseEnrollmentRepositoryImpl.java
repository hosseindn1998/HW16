package Repository.CourseEnrollment;

import Model.CourseEnrollment;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class CourseEnrollmentRepositoryImpl extends BaseRepositoryImpl<CourseEnrollment,Long> implements CourseEnrollmentRepository {

    public CourseEnrollmentRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<CourseEnrollment> getEntityClass() {
        return CourseEnrollment.class;
    }
}
