package Model;

import base.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
public class CourseOccurrence extends BaseEntity<Long> {
    Integer occurrenceYear;
    Integer OccurrenceNumber;
    @ManyToOne
    Professor professor;
    Date startDate;
    Date endDate;
    Integer capacity;
    @ElementCollection(fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "courseOccurrence")
    List<Schedule>schedules;
    @ManyToOne
    Course course;
    @OneToMany(mappedBy = "courseOccurrence")
    List<AssistantProfessor>assistantProfessors;
    @OneToMany(mappedBy = "courseOccurrence")
    List<CourseEnrollment>courseEnrollments;

    @Override
    public String toString() {
        return "CourseOccurrence{" +
                "occurrenceYear=" + occurrenceYear +
                ", OccurrenceNumber=" + OccurrenceNumber +
                ", professor=" + professor +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", capacity=" + capacity +
                ", schedules=" + schedules +
                ", course=" + course +
                ", assistantProfessors=" + assistantProfessors +
                ", courseEnrollments=" + courseEnrollments +
                '}';
    }
}
