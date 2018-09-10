import deposits.BasicDeposit;
import magic_wands.BasicMagicWand;
import wizards.BasicWizard;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String [] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("magic_land");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        BasicDeposit deposit = new BasicDeposit();
        BasicDeposit deposit1 = new BasicDeposit("Safe deposit","2018-01-01","2018-12-12",2020.20,2.2,30);
        BasicMagicWand magicWand = new BasicMagicWand("Trinity",33);
        BasicWizard basicWizard = new BasicWizard("George","Grooves","Low stamina, High endurance",23,magicWand);

        basicWizard.addDeposit(deposit);
        basicWizard.addDeposit(deposit1);

        em.persist(magicWand);
        em.persist(basicWizard);



        em.getTransaction().commit();
        em.close();
    }
}
