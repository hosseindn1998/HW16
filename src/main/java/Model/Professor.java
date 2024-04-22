package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString(callSuper = true)
@Entity
public class Professor extends Person{
    Boolean isHeyatElmi;
    Integer hoqoqPaye;
    Integer vahedMabna;
    Integer salary;
    @ToString.Exclude
    @OneToMany(mappedBy = "professor")
    List<CourseOccurrence> courseOccurrences;
    @ToString.Exclude
    @OneToMany(mappedBy = "professor")
    List<ProfessorCourse>professorCourses;
    @ToString.Exclude
    @OneToMany(mappedBy = "professor")
    List<AssistantProfessor>assistantProfessors;
}
