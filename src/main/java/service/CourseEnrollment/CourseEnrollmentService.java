package service.CourseEnrollment;

import Model.CourseEnrollment;
import base.service.BaseService;
import jakarta.persistence.criteria.CriteriaBuilder;

public interface CourseEnrollmentService extends BaseService<CourseEnrollment,Long> {
    Boolean isEnrollment(Integer studentId, Integer courseId);
    Boolean isCoursePassed(Integer studentId, Integer courseId);
    Boolean isAverageMorThan18(Integer studentId, Integer occurrence);
}
