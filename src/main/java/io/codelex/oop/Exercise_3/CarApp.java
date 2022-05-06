package io.codelex.oop.Exercise_3;

import java.util.Arrays;
import java.util.List;

public class CarApp {

    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("Opel", 1960, "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Mercedes", 1920, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("BMW", 1950, "Germany");

        List<Manufacturer> manufacturers = Arrays.asList(manufacturer1, manufacturer2, manufacturer3);

        Car suzuki = new Car("Suzuki", "SZ70", 3000, 2007, manufacturers, EngineType.S3);
        Car nissan = new Car("Nissan", "GT34", 30000, 1998, manufacturers, EngineType.V8);
        Car toyota = new Car("Toyota", "Raw", 4500, 2004, manufacturers, EngineType.V6);

        CarService carService = new CarService();

        carService.addCar(suzuki);
        carService.addCar(nissan);
        carService.addCar(toyota);
        System.out.println(carService);

        carService.removeCar(toyota);
        System.out.println(carService);

        System.out.println(carService.before1999());
        System.out.println(carService.v12Cars());
        System.out.println(carService.carWithThreeManufacturers());
        System.out.println(carService.mostExpensive());
        System.out.println(carService.cheapest());

        System.out.println(carService.specificManufacturer("Nissan"));
        System.out.println(carService.isCarOnList("Toyota"));
        System.out.println(carService.sameManufacturer(2004, ">="));
    }
}
