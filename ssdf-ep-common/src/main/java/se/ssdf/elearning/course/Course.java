package se.ssdf.elearning.course;

import se.ssdf.elearning.Email;
import se.ssdf.elearning.users.roles.Instructor;
import se.ssdf.elearning.PhoneNumber;
import se.ssdf.elearning.users.roles.Student;

import java.util.Date;
import java.util.List;

/**
 * Represents a typical course, containing a generated course id and with a start date.
 */
public interface Course {
    /**
     * A unique global id that identifies the course.
     *
     * @return CourseId [required]
     */
    CourseId getCourseId();

    /**
     * A required date when this course starts
     *
     * @return course start [required].
     */
    Date getStart();

    /**
     * Returns the email where interested students can ask questions, if no email is given it will use the certifying
     * instructors email instead. This is a required field.
     *
     * @return email [required].
     */
    Email getSupportEmail();

    /**
     * Returns the email where interested students can ask questions, if no email is given it will use the certifying
     * instructors email instead.
     *
     * @return PhoneNumber [required]
     */
    PhoneNumber getSupportPhoneNumber();

    /**
     * The certifying instructor is the head instructor for the course, the person who's name is on the certificate.
     *
     * @return Instructor [required].
     */
    Instructor getCertifyingInstructor();

    /**
     * Returns all instructors that are involved in the course, including the head instructor. This method will always
     * return one or more instructors
     *
     * @return Instructor [required].
     */
    List<Instructor> getInstructors();

    /**
     * Returns the students belonging to this course.
     *
     * @return a list of students, or an empty list if no students are registered.
     */
    List<Student> getStudents();
}
