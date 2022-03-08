package io.codelex.classesandobjects.practice.Exercise_5;

public class DateTest {

    public static void main(String[] args) {

        Date date1 = new Date(03, 27, 1996);
        date1.displayDate();
        date1.setDay(27);
        date1.setMonth(03);
        date1.setYear(2022);
        date1.displayDate();
    }
}
