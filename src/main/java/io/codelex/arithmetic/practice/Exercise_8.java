package io.codelex.arithmetic.practice;

public class Exercise_8 {


    public static void main(String[] args) {

        String employee1 = Employee(7.50, 37);
        String employee2 = Employee(8.20, 47);
        String employee3 = Employee(10.00, 73);


    }
    public static String Employee(double basePay, int hoursWorked) {

        int overtime = hoursWorked - 40;
        double overtimePay = basePay * 1.5;
        double salary = 40 * basePay + (overtime * overtimePay);

        if (basePay < 8.00 || hoursWorked > 60) {
            System.out.println("Error");
        } else {
            System.out.println("Employee earned " + salary + ".");
        }
        return null;
    }
}

/////////////////Hopefully pareizi/////////////////////