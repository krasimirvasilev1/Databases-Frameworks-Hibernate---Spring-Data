package bg.salesdatabase.model;

import bg.salesdatabase.model.interfaces.BaseCustomer;
import bg.salesdatabase.model.interfaces.BaseProduct;
import bg.salesdatabase.model.interfaces.BaseSale;
import bg.salesdatabase.model.interfaces.BaseStoreLocation;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Sale extends BaseEntity implements BaseSale {

    @ManyToOne(cascade = CascadeType.PERSIST, targetEntity = Product.class, optional = false)
    private BaseProduct product;

    @ManyToOne(cascade = CascadeType.PERSIST, targetEntity = Customer.class, optional = false)
    private BaseCustomer customer;

    @ManyToOne(cascade = CascadeType.PERSIST, targetEntity = StoreLocation.class, optional = false)
    private BaseStoreLocation storeLocation;

    @Basic
    private LocalDateTime created;

    @Override
    public BaseProduct getProduct() {
        return product;
    }

    @Override
    public void setProduct(BaseProduct product) {
        this.product = product;
    }

    @Override
    public BaseCustomer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(BaseCustomer customer) {
        this.customer = customer;
    }

    @Override
    public BaseStoreLocation getStoreLocation() {
        return storeLocation;
    }

    @Override
    public void setStoreLocation(BaseStoreLocation storeLocation) {
        this.storeLocation = storeLocation;
    }

    @Override
    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
