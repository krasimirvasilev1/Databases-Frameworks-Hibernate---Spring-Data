import ingredients.BasicIngredient;
import ingredients.Mint;
import ingredients.Nettle;
import ingredients.Strawberry;
import label.BasicLabel;
import shampoo.BasicShampoo;
import shampoo.PinkPanter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

public class Main {
    public static void main(String [] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("shampoo_company");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        BasicLabel label = new BasicLabel("String label");
        BasicLabel label1 = new BasicLabel("String somethingOther");
        PinkPanter shampoo = new PinkPanter(label1);
        ArrayList<BasicIngredient> arrayList = new ArrayList<>(Arrays.asList(new Mint(), new Nettle(), new Strawberry()));
        Set<BasicIngredient> hashSet = new HashSet<>(arrayList);
        shampoo.setIngredients(hashSet);

        em.persist(label);
        em.persist(shampoo);

        em.getTransaction().commit();
        em.close();
    }
}
