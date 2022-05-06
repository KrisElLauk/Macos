package io.codelex.oop.Exercise_2;

import java.time.LocalDate;

public class PersonApp {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2009, 07, 23);
        Employee employee = new Employee("John", "Brown", "7", 47, "Accountant", date);
        Customer customer = new Customer("Peter", "Brown", "457", 51, "CID1234", 10);

        System.out.println(employee.getInfo());
        System.out.println(customer.getInfo());
    }
}
