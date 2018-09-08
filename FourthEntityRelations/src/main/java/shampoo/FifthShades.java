package shampoo;

import ingredients.*;
import label.BasicLabel;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FifthShades extends BasicShampoo {
    private static final String BRAND = "Fifth Shades";
    @Enumerated(value = EnumType.STRING)
    private static final Size SIZE = Size.SMALL;
    private static final BigDecimal PRICE = new BigDecimal("6.69");
    private static final BasicLabel LABEL = new BasicLabel("It’s made of Strawberry and Nettle") {
    };

    public FifthShades() {
        super(BRAND, LABEL, SIZE, PRICE);
    }
}
