package pl.piotrnowicki.springbootfirstproject.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.piotrnowicki.springbootfirstproject.persistence.model.Course;

public interface CourseRepo extends BaseRepository<Course, Long> {
}
