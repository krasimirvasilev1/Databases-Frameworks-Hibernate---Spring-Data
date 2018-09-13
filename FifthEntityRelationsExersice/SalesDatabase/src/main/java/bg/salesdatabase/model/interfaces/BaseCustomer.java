package bg.salesdatabase.model.interfaces;

import java.util.Set;

public interface BaseCustomer extends Identifiable {
    String getName();

    void setName(String name);

    String getEmail();

    void setEmail(String email);

    String getCreditCardNumber();

    void setCreditCardNumber(String creditCardNumber);

    Set<BaseSale> getSales();

    void setSales(Set<BaseSale> sales);
}
