package Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString(callSuper = true)
@Entity
@Table(name = "student")
public class Student extends Person {
    @ToString.Exclude
    @OneToMany(mappedBy = "student")
    Collection<CareerEnrollment> careerEnrollments=new ArrayList<>();
    @ToString.Exclude
    @OneToMany(mappedBy = "student")
    Collection<CourseEnrollment>courseEnrollments=new ArrayList<>();
    String studentCode;
    Integer lastAverage;


    public Student(String firstName, String lastName, String nationalCode, Date dateOfBirth, String email, String phoneNumber, String username, String password, String studentCode) {
        super(firstName, lastName, nationalCode, dateOfBirth, email, phoneNumber, username, password);
        this.studentCode = studentCode;

    }

    public Student(Long aLong, String username, String password, String studentCode) {
        super(aLong, username, password);
        this.studentCode = studentCode;
    }

    public Student(String studentCode) {
        this.studentCode = studentCode;
    }


}
