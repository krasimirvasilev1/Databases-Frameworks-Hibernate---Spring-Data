package bg.salesdatabase.model.interfaces;

import java.math.BigDecimal;
import java.util.Set;

public interface BaseProduct extends Identifiable {
    String getName();

    void setName(String name);

    double getQuantity();

    void setQuantity(double quantity);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

    Set<BaseSale> getSales();

    void setSales(Set<BaseSale> sales);
}
