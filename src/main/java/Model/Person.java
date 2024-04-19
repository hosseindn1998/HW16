package Model;

import base.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
public class Person extends BaseEntity<Long> {

    String firstName;
    String lastName;
    String nationalCode;
    Date dateOfBirth;
    String email;
    String phoneNumber;
//    @Column(unique = true)
    String username;
//    @Pattern(regexp = "^((?=\\S*?[A-Z])(?=\\S*?[a-z])(?=\\S*?[0-9]).{6,})\\S$")
    String password;

    public Person(Long aLong, String firstName, String lastName, String nationalCode, Date dateOfBirth, String email, String phoneNumber, String username, String password) {
        super(aLong);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
    }

    public Person(Long aLong, String username, String password) {
        super((aLong));
        this.username=username;
        this.password=password;
    }
}
