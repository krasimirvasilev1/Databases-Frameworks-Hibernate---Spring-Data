package bg.salesdatabase.model;

import bg.salesdatabase.model.interfaces.BaseSale;
import bg.salesdatabase.model.interfaces.BaseStoreLocation;

import javax.persistence.*;
import java.util.Set;

@Entity
public class StoreLocation extends BaseEntity implements BaseStoreLocation {
    @Column(unique = true)
    private String locationName;

    @OneToMany(targetEntity = Sale.class, mappedBy = "storeLocation")
    private Set<BaseSale> sales;

    @Override
    public String getLocationName() {
        return this.locationName;
    }

    @Override
    public void setLocationName(String name) {
        this.locationName = name;
    }

    @Override
    public Set<BaseSale> getSales() {
        return this.sales;
    }

    @Override
    public void setSales(Set<BaseSale> sales) {
        this.sales = sales;
    }
}
