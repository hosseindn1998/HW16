package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString()
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Student extends Person {

    String studentCode;

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
