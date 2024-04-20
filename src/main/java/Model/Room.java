package Model;

import base.entity.BaseEntity;
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
public class Room extends BaseEntity<Long> {
    String roomCode;
    String roomName;
    Integer roomCapacity;
    String location;
    @OneToMany(mappedBy = "room")
    List<Schedule>schedules;

}
