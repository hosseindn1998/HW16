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
@ToString()
@Entity
public class Career extends BaseEntity<Long> {
    String careerName;
    Integer durationYears;
    Integer requiredOptativeCourses;
    @OneToMany(mappedBy = "career")
    List<Course> courses;
    @OneToMany(mappedBy = "career")
    List<CareerEnrollment> careerEnrollment;
    @ManyToOne
    CareerLevel careerLevel;
    @ManyToOne
    Department department;

}
