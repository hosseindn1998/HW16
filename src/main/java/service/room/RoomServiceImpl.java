package service.room;

import Model.Room;
import Repository.room.RoomRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class RoomServiceImpl extends BaseServiceImpl<Room,Long, RoomRepository>implements RoomService {

    public RoomServiceImpl(RoomRepository roomrepository, SessionFactory sessionFactory) {
        super(roomrepository, sessionFactory);
    }

}
