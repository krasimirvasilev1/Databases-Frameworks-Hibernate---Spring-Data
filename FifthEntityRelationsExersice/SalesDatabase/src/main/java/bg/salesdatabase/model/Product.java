package bg.salesdatabase.model;

import bg.salesdatabase.model.interfaces.BaseProduct;
import bg.salesdatabase.model.interfaces.BaseSale;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Product extends BaseEntity implements BaseProduct {
    @Column(length = 60, unique = true)
    private String name;

    @Basic
    private double quantity;

    @Basic
    private BigDecimal price;

    @OneToMany(targetEntity = Sale.class, mappedBy = "product")
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
    public double getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public Set<BaseSale> getSales() {
        return sales;
    }

    @Override
    public void setSales(Set<BaseSale> sales) {
        this.sales = sales;
    }

    /*@Override
    public void addSale(BaseSale sale) {
        this.sales.add(sale);
    }*/
}
