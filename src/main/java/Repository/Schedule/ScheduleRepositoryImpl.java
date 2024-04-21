package Repository.Schedule;

import Model.Schedule;
import base.repository.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class ScheduleRepositoryImpl extends BaseRepositoryImpl<Schedule,Long> implements ScheduleRepository {

    public ScheduleRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Schedule> getEntityClass() {
        return Schedule.class;
    }
}
