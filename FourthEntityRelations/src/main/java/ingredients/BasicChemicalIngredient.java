package ingredients;

import javax.persistence.Column;
import java.math.BigDecimal;

abstract class BasicChemicalIngredient extends BasicIngredient{
    @Column(name = "chemical_formula")
    private String chemicalFormula;

    BasicChemicalIngredient(String name, BigDecimal price, String chemicalFormula) {
        super(name, price);
        setChemicalFormula(chemicalFormula);
    }

    private void setChemicalFormula(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }
}
