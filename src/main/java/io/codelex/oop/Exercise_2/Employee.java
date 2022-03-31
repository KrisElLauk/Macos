package io.codelex.oop.Exercise_2;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate startDate = this.startedWorking;
        LocalDate dateNow = LocalDate.now();
        if ((startedWorking != null) && (dateNow != null)) {
            return Period.between(startedWorking, dateNow).getYears();
        }
        return 0;
    }

    String getInfo() {
        return position + " " + getFirstName() + " " + getLastName() + " (" + getWorkExperience() + " years).";
    }
}
