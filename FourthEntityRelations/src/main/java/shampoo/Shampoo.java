package shampoo;

import ingredients.BasicIngredient;
import label.BasicLabel;

import java.math.BigDecimal;
import java.util.Set;

interface Shampoo {
    void setSize(Size size);

    Size getSize();

    long getId();

    void setId(long id);

    String getBrand();

    void setBrand(String brand);

    BasicLabel getLabel();

    void setLabel(BasicLabel label);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

    Set<BasicIngredient> getIngredients();

    void setIngredients(Set<BasicIngredient> ingredients);
}
