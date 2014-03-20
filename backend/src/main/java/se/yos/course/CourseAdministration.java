package se.yos.course;

import se.yos.course.domain.Course;
import se.yos.course.domain.CourseId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CourseAdministration {

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("yos");


    public static Course createCourse() {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Course course = new Course(new CourseId(1));
        course.setDescription("Ny kurs");
        em.persist(course);
        em.getTransaction().commit();
        em.close();

        return course;
    }

    public static Course findFirstCourse() {
        EntityManager em = factory.createEntityManager();
        return (Course) em.createQuery("SELECT course FROM Course course").getSingleResult();
    }

    public static void main(String args[]) {
        createCourse();
    }
}
