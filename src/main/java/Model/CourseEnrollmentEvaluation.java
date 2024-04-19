package Model;

import base.entity.BaseEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseEnrollmentEvaluation extends BaseEntity<Long> {
    Integer courseEnrollmentId;
    Integer evaluationTypeId;
    Date evaluationDate;
    Integer score;
}
