package bg.salesdatabase.model;

import bg.salesdatabase.model.interfaces.BaseCustomer;
import bg.salesdatabase.model.interfaces.BaseSale;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer extends BaseEntity implements BaseCustomer {
    @Column(length = 60, nullable = false)
    private String name;

    @Basic
    private String email;

    @Basic
    private String creditCardNumber;

    @OneToMany(targetEntity = Sale.class, mappedBy = "customer")
    private Set<BaseSale> sales;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public Set<BaseSale> getSales() {
        return sales;
    }

    @Override
    public void setSales(Set<BaseSale> sales) {
        this.sales = sales;
    }
}
