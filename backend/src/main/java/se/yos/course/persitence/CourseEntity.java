package se.yos.course.persitence;

import se.yos.domain.CourseId;
import se.yos.domain.CourseName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CourseEntity {
    private Long id;
    private final CourseId courseId;
    private CourseName name;
    private String description;

    protected CourseEntity() {
        courseId = null;
    }

    public CourseEntity(final CourseId courseId) {
        this.courseId = courseId;
    }

    @Id @GeneratedValue
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
