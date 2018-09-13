package bg.salesdatabase;

import bg.salesdatabase.model.*;
import bg.salesdatabase.model.interfaces.BaseCustomer;
import bg.salesdatabase.model.interfaces.BaseStoreLocation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sales_database");
        EntityManager em = emf.createEntityManager();

        final EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        try {
            //final Product product = new Product("ketchup",10,new BigDecimal(20));
            final BaseCustomer customer =
                    Utils.generateCustomer("Valery", "valeri.n.stoyanov@gmail.com", "21212345998");

            //final Customer customer1 = Utils.generateCustomerExample("name","email","123123", Customer.class);

            final BaseStoreLocation storeLocation = new StoreLocation();
            storeLocation.setLocationName("Location name" + LocalDateTime.now().toString());

            final Sale sale = new Sale();
            sale.setProduct(new Product());
            sale.setCustomer(customer);
            sale.setStoreLocation(storeLocation);
            sale.setCreated(LocalDateTime.now());

            em.persist(sale);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            em.close();
        }


// The relationships between tables are as follows:
// BaseSale has one product and a product can be sold in many bg.salesdatabase.model.sales
// BaseSale has one customer and a customer can participate in many bg.salesdatabase.model.sales
// BaseSale has one store location and one store location can have many bg.salesdatabase.model.sales
    }
}
