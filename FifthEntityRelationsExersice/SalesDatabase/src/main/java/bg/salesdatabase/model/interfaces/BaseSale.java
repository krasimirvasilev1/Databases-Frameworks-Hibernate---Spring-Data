package bg.salesdatabase.model.interfaces;

import java.time.LocalDateTime;
import java.util.Date;

public interface BaseSale extends Identifiable {
    BaseProduct getProduct();

    void setProduct(BaseProduct product);

    BaseCustomer getCustomer();

    void setCustomer(BaseCustomer customer);

    BaseStoreLocation getStoreLocation();

    void setStoreLocation(BaseStoreLocation storeLocation);

    LocalDateTime getCreated();

    void setCreated(LocalDateTime created);
}
