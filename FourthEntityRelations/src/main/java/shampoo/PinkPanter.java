package shampoo;

import ingredients.*;
import label.BasicLabel;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@Entity
public class PinkPanter extends BasicShampoo {
    @Basic
    private static final String BRAND = "Pink Panther";
    @Enumerated(value = EnumType.STRING)
    private static final Size SIZE = Size.MEDIUM;
    @Basic
    private static final BigDecimal PRICE = new BigDecimal("8.50");

    private static final BasicLabel LABEL = new BasicLabel("It’s made of Lavender and Nettle");

    public PinkPanter(BasicLabel basicLabel) {
        super(BRAND, basicLabel, SIZE, PRICE);
    }

    public PinkPanter() {
    }
}
