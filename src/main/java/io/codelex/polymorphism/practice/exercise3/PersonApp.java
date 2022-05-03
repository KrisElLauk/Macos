package io.codelex.polymorphism.practice.exercise3;

public class PersonApp {

    public static void main(String[] args) {

        Student student = new Student("John", "Lennon", "Random Street 37", 425, 3.67);
        Employee employee = new Employee("Jarno", "Tulip", "Random Street 85", 746, "Teacher");

        student.display();
        employee.display();
    }
}
