/*
Assignment 4.8
Part D
Create a program, which formats the date and time, as shown below.

The first match in the Football Cup takes place on: 17/06/17
The Football Cup Final takes place on: 02-Jul-2017
The kick off time of the  final is: 21:00:00

Use pre-defined format styles in our solution.
Create a class named, Assignment4_8D.java.
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Assignment4_8D {

    public static void main (String[] args) {

        LocalDate firstMatchDate = LocalDate.of(2017, 06, 17);
        LocalDate finalMatchDate = LocalDate.of(2017, 07, 02);
        LocalTime finalMatchTime = LocalTime.of(21,00,00);

        System.out.println("The first match in the Football Cup takes place on: " + firstMatchDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("The Football Cup Final takes place on: " + finalMatchDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("The kick off time of the  final is: " + finalMatchTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

    }
}
