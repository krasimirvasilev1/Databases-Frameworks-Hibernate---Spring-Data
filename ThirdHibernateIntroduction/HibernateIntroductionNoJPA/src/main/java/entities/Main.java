package entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Configuration config = new Configuration();
        config.configure("META-INF/hibernate.cfg.xml");
        SessionFactory sessionFactory =
                config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Your Code Here

        Date newDate = Date.from(LocalDate.parse("2018-12-12").atStartOfDay(ZoneId.systemDefault()).toInstant());
        Student joro = new Student(1,"Joro",newDate);
        session.save(joro);
        Student kris = new Student(2,"Kris",newDate);
        session.save(kris);
        Student kras = new Student(3,"Kras",newDate);
        session.save(kras);

        List<Student> studentList = session.createQuery("select name from Student").list();

        for (Student student : studentList)
        {
            System.out.println(student.toString());
        }
        session.getTransaction().commit();

        List<Student> students =  session.createQuery("SELECT u from Student as u WHERE u.id = 1").getResultList();

        System.out.println(students);
        session.close();
    }
}
