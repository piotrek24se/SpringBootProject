package pl.piotrnowicki.springbootfirstproject.service;

import java.util.List;

public interface CourseService<T> extends BaseService {

    public List<T> getBought();

    public T buyCourse(int id);

}
