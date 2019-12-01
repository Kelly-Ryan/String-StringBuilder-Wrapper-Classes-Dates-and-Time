/*
Assignment 4.7
Part A
Create a Java program named, Assignment4_7A.java, which makes use of classes in the java.time package to perform the following actions:
1. Display today’s date.
2. Display the current time.
3. Display the current date and time.
4. Construct the following date and time:

Year    Month   Day of Month    Hour    Minute  Second
2017     12         25           13       00      05

 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Assignment4_7A {

    public static void main(String[] args) {

        System.out.println("1: Today's date: " + LocalDate.now());
        System.out.println("2: Current time: " + LocalTime.now());
        System.out.println("3: Current date and time: " + LocalDateTime.now());
        System.out.println("4: Constructed date and time: " + LocalDateTime.of(2017, 12, 25, 13,00, 05));
    }

}
