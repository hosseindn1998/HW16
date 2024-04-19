package service.Schedule;

import Model.Schedule;
import Model.Student;
import Repository.Schedule.ScheduleRepository;
import Repository.student.StudentRepository;
import base.service.BaseServiceImpl;

public class ScheduleServiceImpl extends BaseServiceImpl<Schedule,Long, ScheduleRepository>implements ScheduleService {

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        super(scheduleRepository);
    }

}
