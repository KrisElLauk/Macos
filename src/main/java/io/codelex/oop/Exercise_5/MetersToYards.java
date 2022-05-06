package io.codelex.oop.Exercise_5;

import java.math.BigDecimal;

public class MetersToYards extends UnitConverter {

    @Override
    public BigDecimal getCoefficient() {
        return new BigDecimal("1.0936133");
    }
}
