package io.codelex.oop.Exercise_3;

import java.util.Objects;

public class Manufacturer {

    private final String name;
    private final int yearEstablished;
    private final String country;

    public Manufacturer(String name, int yearEstablished, String country) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Manufacturer)) {
            return false;
        }
        Manufacturer manufacturer = (Manufacturer) obj;
        return yearEstablished == manufacturer.yearEstablished
                && name.equals(manufacturer.name)
                && country.equals(manufacturer.country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearEstablished, country);
    }
}
