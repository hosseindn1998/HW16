package Model;

import base.entity.BaseEntity;
import jakarta.persistence.ElementCollection;
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
@ToString(callSuper = true)
@Entity
public class Course extends BaseEntity<Long> {
    String courseName;
    Integer unit;
    @ManyToOne
    Career career;
    @OneToMany(mappedBy = "course")
    List<CourseOccurrence> courseOccurrences;
    @OneToMany(mappedBy = "mainCourse")
    List<CourseDependency> mainCourseDependency;
    @OneToMany(mappedBy = "requiredCourse")
    List<CourseDependency> requiredCourseDependency;
    @OneToMany(mappedBy = "course")
    List<ProfessorCourse>professorCourses;
    String courseCode;
    Integer year;
    Integer semester;
    Boolean optative;

}
