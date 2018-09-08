package shampoo;

import ingredients.AmmoniumChloride;
import ingredients.BasicIngredient;
import ingredients.Mint;
import ingredients.Nettle;
import label.BasicLabel;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FreshNuke extends BasicShampoo {
    private static final String BRAND = "Fresh Nuke";
    @Enumerated(value = EnumType.STRING)
    private static final Size SIZE = Size.LARGE;
    private static final BigDecimal PRICE = new BigDecimal("9.33");
    private static final BasicLabel LABEL = new BasicLabel("It’s made of Mint, Nettle and Ammonium Chloride");

    public FreshNuke() {
        super(BRAND, LABEL, SIZE, PRICE);
    }
}
