package pl.piotrnowicki.springbootfirstproject.service;

import pl.piotrnowicki.springbootfirstproject.model.CourseDTO;
import pl.piotrnowicki.springbootfirstproject.persistence.model.Course;
import pl.piotrnowicki.springbootfirstproject.persistence.repository.CourseRepo;

public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);

}
