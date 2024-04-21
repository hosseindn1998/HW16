package Repository.room;

import Model.Room;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class RoomRepositoryImpl extends BaseRepositoryImpl<Room,Long> implements RoomRepository {

    public RoomRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Room> getEntityClass() {
        return Room.class;
    }
}
