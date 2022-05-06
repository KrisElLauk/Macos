package io.codelex.oop.Exercise_3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car name) {
        cars.add(name);
    }

    public void removeCar(Car name) {
        cars.remove(name);
    }

    @Override
    public String toString() {
        return "CarService{" +
                "cars=" + cars +
                '}';
    }

    public List<Car> v12Cars() {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType() == EngineType.V12) {
                carList.add(car);
            }
        }
        return carList;
    }

    public List<Car> before1999() {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearManufactured() < 1999) {
                carList.add(car);
            }
        }
        return carList;
    }

    public Car mostExpensive() {
        BigDecimal mostExpensive = new BigDecimal(0);
        Car expensiveCar = null;
        for (Car car : cars) {
            if (car.getPrice().compareTo(mostExpensive) > 0) {
                mostExpensive = car.getPrice();
                expensiveCar = car;
            }
        }
        return expensiveCar;
    }

    public Car cheapest() {
        BigDecimal cheapest = new BigDecimal(0);
        Car cheapCar = null;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice().compareTo(cheapest) < 0) {
                cheapest = cars.get(i).getPrice();
                cheapCar = cars.get(i);
            } else if (i == 0) {
                cheapest = cars.get(i).getPrice();
                cheapCar = cars.get(i);
            }
        }
        return cheapCar;
    }

    public List<Car> carWithThreeManufacturers() {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturerList().size() >= 3) {
                carList.add(car);
            }
        }
        return carList;
    }

    public void ascendingCarList() {
        Collections.sort(cars);
        System.out.println(cars);
    }

    public void descendingCarList() {
        Collections.sort(cars);
        for (int j = cars.size(); j > 0; j--) {
            System.out.println(cars.get(j - 1));
        }
    }

    public boolean isCarOnList(String name) {
        boolean carOnList = false;
        for (Car car : cars) {
            if (car.getName().equals(name)) {
                carOnList = true;
                break;
            }
        }
        return carOnList;
    }

    public List<Car> specificManufacturer(String manufacturerName) {
        List<Car> specificManufacturer = new ArrayList<>();
        for (Car car : cars) {
            for (Manufacturer manufacturer : car.getManufacturerList()) {
                if (manufacturer.getName().equals(manufacturerName)) {
                    specificManufacturer.add(car);
                }
            }
        }
        return specificManufacturer;
    }

    public List<Car> sameManufacturer(int yearEstablished, String operator) {
        List<Car> sameManufacturer = new ArrayList<>();
        for (Car car : cars) {
            for (Manufacturer manufacturer : car.getManufacturerList()) {
                if (operator.equals("=")) {
                    if (manufacturer.getYearEstablished() == yearEstablished) {
                        sameManufacturer.add(car);
                    }
                }
                if (operator.equals("!=")) {
                    if (manufacturer.getYearEstablished() != yearEstablished) {
                        sameManufacturer.add(car);
                    }
                }
                if (operator.equals(">")) {
                    if (manufacturer.getYearEstablished() > yearEstablished) {
                        sameManufacturer.add(car);
                    }
                }
                if (operator.equals("<")) {
                    if (manufacturer.getYearEstablished() < yearEstablished) {
                        sameManufacturer.add(car);
                    }
                }
                if (operator.equals("<=")) {
                    if (manufacturer.getYearEstablished() <= yearEstablished) {
                        sameManufacturer.add(car);
                    }
                }
                if (operator.equals(">=")) {
                    if (manufacturer.getYearEstablished() >= yearEstablished) {
                        sameManufacturer.add(car);
                    }
                }
            }
        }
        return sameManufacturer;
    }
}
