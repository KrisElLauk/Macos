package io.codelex.oop.Exercise_5;

import java.math.BigDecimal;

public class ConverterApp {

    public static void main(String[] args) {

        BigDecimal valueToConvert = new BigDecimal("21");

        BigDecimal result = MeasurementConverter.converter(ConversionType.KM_TO_MILES, valueToConvert);

        System.out.println(result);
    }
}
