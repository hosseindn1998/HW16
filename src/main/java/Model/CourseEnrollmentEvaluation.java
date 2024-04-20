package Model;

import base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Entity
public class CourseEnrollmentEvaluation extends BaseEntity<Long> {
    @ManyToOne
    CourseEnrollment courseEnrollment;
    @ManyToOne
    EvaluationType evaluationType;
    Date evaluationDate;
    Integer score;
}
