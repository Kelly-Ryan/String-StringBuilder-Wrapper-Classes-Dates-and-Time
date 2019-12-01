/*
Assignment 4.7
Part C
Create a class named Assignment4_7C.java.
2017-06-07 11:20
Create the specified date and time (using a LocalDateTime object), making use of the following classes in the java.time package.
 LocalDate
 LocalTime
Using method chaining, use methods of the LocalDateTime object to subtract 7 days, 6 hours and 30 seconds from the LocalDateTime object, previously created.

 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Assignment4_7C {

    public static void main (String[] args) {

        LocalDate date = LocalDate.of(2017, 06, 07);
        LocalTime time = LocalTime.of(11,20);
        LocalDateTime ldt = LocalDateTime.of(date, time);

        System.out.println("Date Constructed: " + ldt);

        ldt = ldt.minusDays(7).minusHours(6).minusSeconds(30);
        System.out.println("New Date: (minus 7 days, 6 hours, 30 seconds): " + ldt);
    }

}
