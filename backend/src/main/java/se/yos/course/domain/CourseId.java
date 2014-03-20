package se.yos.course.domain;

public class CourseId {
    private final double id;

    public CourseId(final double id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
