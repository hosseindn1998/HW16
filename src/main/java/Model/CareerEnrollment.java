package Model;

import base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
public class CareerEnrollment extends BaseEntity<Long> {
    @ManyToOne
    Student student;
    @ManyToOne
    Career career;
    Date enrollmentDate;
    @ManyToOne
    CareerStatus careerStatus;
    Date careerStatusDate;

}
