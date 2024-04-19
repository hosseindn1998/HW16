package Model;

import base.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Career extends BaseEntity<Long> {
    String careerName;
    Integer durationYears;
    Integer requiredOptativeCourses;
    Integer careerLevelId;
}
