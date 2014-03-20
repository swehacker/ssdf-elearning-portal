package se.yos.course.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
    private Long id;
    private final CourseId courseId;
    private CourseName name;
    private String description;

    protected Course() {
        courseId = null;
    }

    public Course(final CourseId courseId) {
        this.courseId = courseId;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id1) {
        id = id1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CourseId getCourseId() {
        return courseId;
    }
}
