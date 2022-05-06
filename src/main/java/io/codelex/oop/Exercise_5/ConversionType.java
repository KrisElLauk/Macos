package io.codelex.oop.Exercise_5;

public enum ConversionType {

    CM_TO_INCHES(new CmToInches()),
    INCHES_TO_CM(new InchesToCm()),
    KM_TO_MILES(new KmToMiles()),
    MILES_TO_KM(new MilesToKm()),
    METERS_TO_YARDS(new MetersToYards()),
    YARDS_TO_METERS(new YardsToMeters());

    public Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }
}
