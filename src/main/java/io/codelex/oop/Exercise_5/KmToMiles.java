package io.codelex.oop.Exercise_5;

import java.math.BigDecimal;

public class KmToMiles extends UnitConverter {

    @Override
    public BigDecimal getCoefficient() {
        return new BigDecimal("0.621371192");
    }
}
