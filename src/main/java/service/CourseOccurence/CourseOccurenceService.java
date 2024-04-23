package service.CourseOccurence;

import Model.CourseOccurrence;
import base.service.BaseService;

import java.util.List;

public interface CourseOccurenceService extends BaseService<CourseOccurrence,Long> {
    Integer findUnitProfessor(Integer professorId, Integer occurrenceYear, Integer occurrenceNumber);
    Integer findUnitStudent(Integer studentId, Integer occurrenceYear, Integer occurrenceNumber);
    List<String> showScores(Integer studentId, Integer occurrenceYear, Integer occurrenceNumber);
}
