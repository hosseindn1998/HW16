package Repository.CourseOccurence;

import Model.CourseOccurrence;
import base.repository.BaseRepository;

import java.util.List;

public interface CourseOccurenceRepository extends BaseRepository<CourseOccurrence,Long> {
    Integer findUnitProfessor(Integer professorId, Integer occurrenceYear, Integer occurrenceNumber);
    Integer findUnitStudent(Integer studentId, Integer occurrenceYear, Integer occurrenceNumber);
    List<String> showScores(Integer studentId, Integer occurrenceYear, Integer occurrenceNumber);
}
