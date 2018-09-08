package ingredients;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue(value = "ST")
public class Lavander extends BasicIngredient {
    private static final String NAME = "Lavander";
    private static final BigDecimal PRICE = new BigDecimal(2);

    public Lavander() {
        super(NAME,PRICE);
    }

    public static String getNAME() {
        return NAME;
    }

    public static BigDecimal getPRICE() {
        return PRICE;
    }
}
