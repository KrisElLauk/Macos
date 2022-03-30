package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise_1 {

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2022, 03, 27);
        LocalDate end = LocalDate.of(2022, 05, 27);

        int hoursPerDay = 8;
        int hoursWorked;


        Set<DayOfWeek> workingDays = Set.of(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY);

        List<LocalDate> worked = start.datesUntil(end).filter(t -> workingDays.contains(t.getDayOfWeek())).collect(Collectors.toList());

        System.out.println(worked);
        hoursWorked = worked.size() * hoursPerDay;
        System.out.println(hoursWorked + " hours worked during the period.");
    }
}
