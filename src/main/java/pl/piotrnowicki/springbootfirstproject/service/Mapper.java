package pl.piotrnowicki.springbootfirstproject.service;

import pl.piotrnowicki.springbootfirstproject.model.CourseDTO;
import pl.piotrnowicki.springbootfirstproject.persistence.model.Course;

public class Mapper {

    public static CourseDTO courseToDTO(Course course) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setName(course.getName());
        courseDTO.setId(course.getId());
        return courseDTO;
    }

    public static Course dtoToCourse(CourseDTO courseDTO) {
        Course course = new Course();

        course.setId(courseDTO.getId());
        course.setName(courseDTO.getName());

        return course;
    }

}
