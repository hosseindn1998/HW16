package Repository.CourseEnrollmentEvaluation;

import Model.CourseEnrollmentEvaluation;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class CourseEnrollmentEvaluationRepositoryImpl extends BaseRepositoryImpl<CourseEnrollmentEvaluation,Long> implements CourseEnrollmentEvaluationRepository {

    public CourseEnrollmentEvaluationRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<CourseEnrollmentEvaluation> getEntityClass() {
        return CourseEnrollmentEvaluation.class;
    }
}
