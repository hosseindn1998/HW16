package Model;

import base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Entity
public class CourseEnrollment extends BaseEntity<Long> {
    @ManyToOne
    Student student;
    @OneToMany(mappedBy = "courseEnrollment")
    List<CourseEnrollmentEvaluation>courseEnrollmentEvaluations;
    @ManyToOne
    CourseOccurrence courseOccurrence;
    Integer finalScore;
}
