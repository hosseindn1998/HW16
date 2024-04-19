package Model;

import base.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString()
public class CourseOccurrence extends BaseEntity<Long> {
    Integer courseId;
    Integer occurrenceYear;
    String courseOccurrenceCode;
    Integer professorId;
    Date startDate;
    Date endDate;
    Integer capacity;
}
