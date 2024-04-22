package service.CourseOccurence;

import Model.CourseOccurrence;
import base.service.BaseService;

public interface CourseOccurenceService extends BaseService<CourseOccurrence,Long> {
    Integer findUnit(Integer professorId);
}
