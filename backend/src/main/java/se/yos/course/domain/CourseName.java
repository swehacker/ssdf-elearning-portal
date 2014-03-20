package se.yos.course.domain;

public class CourseName {
    private final String name;

    private CourseName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static CourseName create(String name) {
        return new CourseName(name);
    }
}
