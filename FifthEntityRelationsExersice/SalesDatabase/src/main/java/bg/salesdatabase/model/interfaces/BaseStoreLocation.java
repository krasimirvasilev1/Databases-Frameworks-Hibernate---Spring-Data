package bg.salesdatabase.model.interfaces;

import java.util.Set;

public interface BaseStoreLocation extends Identifiable {
    String getLocationName();

    void setLocationName(String name);

    Set<BaseSale> getSales();

    void setSales(Set<BaseSale> sales);
}
