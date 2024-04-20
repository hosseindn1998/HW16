package Model;

import base.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.prefs.BackingStoreException;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Entity

public class EvaluationType extends BaseEntity<Long> {
    @OneToMany(mappedBy = "evaluationType")
    List<CourseEnrollmentEvaluation> courseEnrollmentEvaluations;
    String evaluationTypeName;
    Boolean isGroupActivity;
}
