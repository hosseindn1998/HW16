package Model;

import base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseEnrollment extends BaseEntity<Long> {
    Integer studentId;
    Integer courseOccurrenceId;
    Integer finalScore;
}
