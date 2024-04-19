package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import lombok.experimental.FieldDefaults;

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
}
