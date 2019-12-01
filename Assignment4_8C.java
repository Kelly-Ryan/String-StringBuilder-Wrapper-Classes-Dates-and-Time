/*
Assignment 4.8
Part C
Create a Java program, which formats the date and time, as shown below.

"The Football Cup starts on: 17-06-2017"
"Russia vs New Zealand kicks off at: 18:00:00"

Use a user-defined date format and a user-defined time format in your solution.
Create a class named, Assignment4_8C.java.
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Assignment4_8C {

    public static void main (String[] args) {

        LocalDate date = LocalDate.of(2017, 06, 17);
        LocalTime time = LocalTime.of(18, 0, 0);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("The Football Cup starts on : " + date.format(dateFormat));
        System.out.println("Russia vs New Zealand kicks off at: " + time.format(timeFormat));
    }
}
