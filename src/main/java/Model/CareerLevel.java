package Model;

import base.entity.BaseEntity;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Entity
public class CareerLevel extends BaseEntity<Long> {

    @OneToMany(mappedBy = "careerLevel")
    List<Career> career;
    String careerLevelName;
}
