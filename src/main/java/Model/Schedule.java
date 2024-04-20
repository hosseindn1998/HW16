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
@Entity
@ToString
public class Schedule extends BaseEntity<Long> {
    @ManyToOne
    CourseOccurrence courseOccurrence;
    Integer occurrenceYear;
    String courseOccurrenceCode;
    Integer professorId;
    Date startDate;
    Date endDate;
    Integer capacity;
    @ManyToOne
    Room room;
}
