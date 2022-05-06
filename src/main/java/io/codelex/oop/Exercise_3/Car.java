package io.codelex.oop.Exercise_3;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Car implements Comparable<Car> {

    private final String name;
    private final String model;
    private final BigDecimal price;
    private final int yearManufactured;
    private final List<Manufacturer> manufacturerList;
    private final EngineType engineType;

    public Car(String name, String model, double price, int yearManufactured, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = BigDecimal.valueOf(price);
        this.yearManufactured = yearManufactured;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        return price == car.price && yearManufactured == car.yearManufactured
                && name.equals(car.name) && model.equals(car.model)
                && manufacturerList.equals(car.manufacturerList)
                && engineType == car.engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearManufactured=" + yearManufactured +
                ", manufacturerList=" + manufacturerList +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearManufactured, manufacturerList, engineType);
    }


    @Override
    public int compareTo(Car o) {
        return name.compareTo(o.name);
    }
}
