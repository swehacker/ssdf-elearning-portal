package se.ssdf.elearning.services;

import se.ssdf.elearning.course.Course;
import se.ssdf.elearning.users.User;

import java.util.List;

public interface CourseService {
    Course create(User instructor, List<User> helpInstructors);
}
