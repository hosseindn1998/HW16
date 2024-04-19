package service.room;

import Model.Room;
import Model.Student;
import Repository.room.RoomRepository;
import Repository.student.StudentRepository;
import base.service.BaseServiceImpl;

public class RoomServiceImpl extends BaseServiceImpl<Room,Long, RoomRepository>implements RoomService {

    public RoomServiceImpl(RoomRepository roomrepository) {
        super(roomrepository);
    }

}
