package Model;

import base.entity.BaseEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Schedule extends BaseEntity<Long> {
    Integer courseOccurrenceId;
    Integer occurrenceYear;
    String courseOccurrenceCode;
    Integer professorId;
    Date startDate;
    Date endDate;
    Integer capacity;
}
