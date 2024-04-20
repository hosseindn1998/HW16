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
@ToString()
@Entity
public class Professor extends Person{
    Boolean isHeyatElmi;
    Integer hoqoqPaye;
    Integer vahedMabna;
    Integer salary;
    @OneToMany(mappedBy = "professor")
    List<CourseOccurrence> courseOccurrences;
    @OneToMany(mappedBy = "professor")
    List<ProfessorCourse>professorCourses;
    @OneToMany(mappedBy = "professor")
    List<AssistantProfessor>assistantProfessors;
}
