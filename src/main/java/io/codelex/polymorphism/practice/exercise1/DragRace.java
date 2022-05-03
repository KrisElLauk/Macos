package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Mercedes mercedes = new Mercedes();
        Opel opel = new Opel();
        Tesla tesla = new Tesla();

        List<Car> topGear = new ArrayList<>();
        topGear.add(audi);
        topGear.add(bmw);
        topGear.add(lexus);
        topGear.add(mercedes);
        topGear.add(opel);
        topGear.add(tesla);

        for (int i = 0; i <= 10; i++) {
            for (Car car : topGear) {
                car.speedUp();
                if (i == 3) {
                    if (car instanceof Boost) {
                        ((Boost) car).useNitrousOxideEngine();
                    }
                }
            }
        }

        Car winner = null;
        int speedOfWinner = 0;

        for (Car car : topGear) {
            int currentCarsSpeed = Integer.parseInt(car.showCurrentSpeed());
            if (currentCarsSpeed > speedOfWinner) {
                winner = car;
            }
        }

        System.out.println(winner);
    }
}
