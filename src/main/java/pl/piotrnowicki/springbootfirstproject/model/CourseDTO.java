package pl.piotrnowicki.springbootfirstproject.model;

import lombok.Data;

@Data
public class CourseDTO {

    private Long id;
    private String name;
    private int lengthInSecond;


}
