package ingredients;

import shampoo.BasicShampoo;

import java.math.BigDecimal;
import java.util.List;

interface Ingredient {

    String getName();

    void setName(String name);

    long getId();

    void setId(long id);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

    List<BasicShampoo> getShampoos();

    void setShampoos(List<BasicShampoo> shampoos);
}
