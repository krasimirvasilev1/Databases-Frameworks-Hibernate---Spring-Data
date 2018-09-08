package ingredients;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue(value = "AM")
public class AmmoniumChloride extends BasicChemicalIngredient {
    private static final String NAME = "Ammonium Chloride";
    private static final BigDecimal PRICE = new BigDecimal(0.59);
    private static final String CHEMICALFORMULA = "NH4Cl";

    public AmmoniumChloride() {
        super(NAME,PRICE,CHEMICALFORMULA);
    }

    public static String getNAME() {
        return NAME;
    }

    public static BigDecimal getPRICE() {
        return PRICE;
    }

    public static String getCHEMICALFORMULA() {
        return CHEMICALFORMULA;
    }
}
