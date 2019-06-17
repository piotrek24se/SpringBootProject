package pl.piotrnowicki.springbootfirstproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piotrnowicki.springbootfirstproject.model.CourseDTO;
import pl.piotrnowicki.springbootfirstproject.persistence.model.Course;
import pl.piotrnowicki.springbootfirstproject.persistence.repository.CourseRepo;

@Service
public class CourseServiceImpl extends BaseServiceImpl<Course, Long, CourseRepo> implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public CourseRepo getRepository() {
        return courseRepo;
    }

    @Override
    public CourseDTO getCourseDtoById(Long id) {
        return Mapper.courseToDTO(getOne(id));
    }
}
