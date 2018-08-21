package entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("liveDemo");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Empolyee student = new Empolyee("Vladi",new Date(2018,11,22),"vladi.chernishkov@gmail.com");
        Empolyee otherStudent = new Empolyee("Stilian",new Date(2013,9,14),"stilian.cvetkov@gmail.com");
        Empolyee otherStudent1 = new Empolyee("Denislav",new Date(1988,4,1),"denislav.parvanov@abv.bg");

        em.persist(student);
        em.persist(otherStudent);
        em.persist(otherStudent1);

        Empolyee user = em.find(Empolyee.class,1);
        boolean a = em.contains(user);

        System.out.println(a);

        em.getTransaction().commit();

        String debug = "";
        em.close();
//        Configuration config = new Configuration();
//        config.configure("META-INF/hibernate.cfg.xml");
//        SessionFactory sessionFactory =
//                config.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        // Your Code Here
//
//        Date newDate = Date.from(LocalDate.parse("2018-12-12").atStartOfDay(ZoneId.systemDefault()).toInstant());
//        Student joro = new Student(1,"Joro",newDate);
//        session.save(joro);
//        Student kris = new Student(2,"Kris",newDate);
//        session.save(kris);
//        Student kras = new Student(3,"Kras",newDate);
//        session.save(kras);
//
//        List<Student> studentList = session.createQuery("select name from Student").list();
//
//        for (Student student : studentList)
//        {
//            System.out.println(student.toString());
//        }
//        session.getTransaction().commit();
//
//        List<Student> students =  session.createQuery("SELECT u from Student as u WHERE u.id = 1").getResultList();
//
//        System.out.println(students);
//        session.close();
    }
}
