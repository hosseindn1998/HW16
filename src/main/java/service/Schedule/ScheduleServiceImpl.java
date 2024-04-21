package service.Schedule;

import Model.Schedule;
import Repository.Schedule.ScheduleRepository;
import base.service.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class ScheduleServiceImpl extends BaseServiceImpl<Schedule,Long, ScheduleRepository>implements ScheduleService {

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository, SessionFactory sessionFactory) {
        super(scheduleRepository, sessionFactory);
    }

}
