package pl.piotrnowicki.springbootfirstproject.service;

import pl.piotrnowicki.springbootfirstproject.model.CourseDTO;
import pl.piotrnowicki.springbootfirstproject.persistence.model.Course;
import pl.piotrnowicki.springbootfirstproject.persistence.repository.CourseRepo;

import java.util.List;

public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);

    CourseDTO createCourse(CourseDTO courseDTO);

    List<CourseDTO> getAllCourses();

}
