package Repository.room;

import Model.Room;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class RoomRepositoryImpl extends BaseRepositoryImpl<Room,Long> implements RoomRepository {

    public RoomRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<Room> getEntityClass() {
        return Room.class;
    }
}
