package Model;

import base.entity.BaseEntity;
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
@ToString()
@Entity
public class Department extends BaseEntity<Long> {
    @OneToMany(mappedBy = "department")
    List<Career> career;
    String departmentName;
}
