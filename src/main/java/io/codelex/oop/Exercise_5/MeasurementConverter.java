package io.codelex.oop.Exercise_5;

import java.math.BigDecimal;

public class MeasurementConverter {

    public static BigDecimal converter(ConversionType type, BigDecimal value) {
        return type.converter.convert(value);
    }
}
