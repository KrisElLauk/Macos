package io.codelex.oop.Exercise_5;

import java.math.BigDecimal;

public class InchesToCm extends UnitConverter {

    @Override
    public BigDecimal getCoefficient() {
        return new BigDecimal("2.54");
    }
}
