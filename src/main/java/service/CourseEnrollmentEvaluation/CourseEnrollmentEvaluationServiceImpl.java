package service.CourseEnrollmentEvaluation;

import Model.CourseEnrollmentEvaluation;
import Repository.CourseEnrollmentEvaluation.CourseEnrollmentEvaluationRepository;
import base.service.BaseServiceImpl;

public class CourseEnrollmentEvaluationServiceImpl extends BaseServiceImpl<CourseEnrollmentEvaluation,Long, CourseEnrollmentEvaluationRepository>implements CourseEnrollmentEvaluationService {

    public CourseEnrollmentEvaluationServiceImpl(CourseEnrollmentEvaluationRepository courseenrollmentevaluationrepository) {
        super(courseenrollmentevaluationrepository);
    }

}
