package Model;

import base.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Room extends BaseEntity<Long> {
    String roomCode;
    String roomName;
    Integer roomCapacity;
    String location;

}
