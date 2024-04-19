package Model;

import base.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course extends BaseEntity<Long> {
    String courseName;
    Integer careerId;
    String courseCode;
    Integer year;
    Integer semester;
    Boolean optative;
}
