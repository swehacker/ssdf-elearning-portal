package se.ssdf.elearning.services;

import se.ssdf.elearning.users.roles.Instructor;
import se.ssdf.elearning.course.Course;

import java.util.List;

public interface CourseService {
    Course create(Instructor instructor, List<Instructor> helpInstructors);
}
