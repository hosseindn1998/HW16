package service.CourseOccurence;

import Repository.CourseOccurence.CourseOccurenceRepository;
import base.service.BaseServiceImpl;
import Model.CourseOccurrence;

public class CourseOccurenceServiceImpl extends BaseServiceImpl<CourseOccurrence,Long, CourseOccurenceRepository>implements CourseOccurenceService {

    public CourseOccurenceServiceImpl(CourseOccurenceRepository courseOccurencerepository) {
        super(courseOccurencerepository);
    }

}
