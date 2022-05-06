package io.codelex.oop.Exercise_5;

import java.math.BigDecimal;

public abstract class UnitConverter implements Converter {

    @Override
    public BigDecimal convert(BigDecimal value) {
        return value.multiply(getCoefficient());
    }

    public abstract BigDecimal getCoefficient();
}
