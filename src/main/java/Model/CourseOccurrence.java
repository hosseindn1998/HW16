package Model;

import base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString()
@Entity
public class CourseOccurrence extends BaseEntity<Long> {
    Integer occurrenceYear;
    String courseOccurrenceCode;
    @ManyToOne
    Professor professor;
    Date startDate;
    Date endDate;
    Integer capacity;
    @OneToMany(mappedBy = "courseOccurrence")
    List<Schedule>schedules;
    @ManyToOne
    Course course;
    @OneToMany(mappedBy = "courseOccurrence")
    List<AssistantProfessor>assistantProfessors;
    @OneToMany(mappedBy = "courseOccurrence")
    List<CourseEnrollment>courseEnrollments;

}
