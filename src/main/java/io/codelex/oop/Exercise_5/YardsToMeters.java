package io.codelex.oop.Exercise_5;

import java.math.BigDecimal;

public class YardsToMeters extends UnitConverter {

    @Override
    public BigDecimal getCoefficient() {
        return new BigDecimal("0.9144");
    }
}
