package Repository.CourseEnrollment;

import Model.CourseEnrollment;
import base.repository.BaseRepository;

public interface CourseEnrollmentRepository extends BaseRepository<CourseEnrollment,Long> {
    Boolean isEnrollment(Integer studentId, Integer courseId);
    Boolean isCoursePassed(Integer studentId, Integer courseId);
    Boolean isAverageMorThan18(Integer studentId, Integer occurrenceYear,Integer occurrenceNumber);
}
