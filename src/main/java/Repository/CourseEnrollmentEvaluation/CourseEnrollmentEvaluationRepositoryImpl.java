package Repository.CourseEnrollmentEvaluation;

import Model.CourseEnrollmentEvaluation;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class CourseEnrollmentEvaluationRepositoryImpl extends BaseRepositoryImpl<CourseEnrollmentEvaluation,Long> implements CourseEnrollmentEvaluationRepository {

    public CourseEnrollmentEvaluationRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<CourseEnrollmentEvaluation> getEntityClass() {
        return CourseEnrollmentEvaluation.class;
    }
}
