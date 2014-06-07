package se.yos.course;

import se.yos.course.persitence.CourseEntity;
import se.yos.domain.CourseId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CourseAdministration {

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("yos");


    public static CourseEntity createCourse() {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        CourseEntity courseEntity = new CourseEntity(new CourseId(1));
        courseEntity.setDescription("Ny kurs");
        em.persist(courseEntity);
        em.getTransaction().commit();
        em.close();

        return courseEntity;
    }

    public static CourseEntity findFirstCourse() {
        EntityManager em = factory.createEntityManager();
        return (CourseEntity) em.createQuery("SELECT course FROM CourseEntity course").getSingleResult();
    }

    public static void main(String args[]) {
        createCourse();
    }
}
