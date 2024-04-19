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
public class CareerEnrollment extends BaseEntity<Long> {
    Integer studentId;
    Integer careerId;
    Date enrollmentDate;
    Integer careerStatusId;
    Date careerStatusDate;

}
