package Repository.Schedule;

import Model.Schedule;
import base.repository.BaseRepositoryImpl;
import org.hibernate.Session;

public class ScheduleRepositoryImpl extends BaseRepositoryImpl<Schedule,Long> implements ScheduleRepository {

    public ScheduleRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<Schedule> getEntityClass() {
        return Schedule.class;
    }
}
