/*
Assignment4.8
Part B
Create a class named, Assignment4_8B.java.
Create a LocalDate object to store the date 08/06/2017.
Use methods of the LocalDate object, to produce the output shown below.

THURSDAY
JUNE
2017
159

 */

import java.time.LocalDate;

public class Assignment4_8B {

    public static void main (String[] args) {

        LocalDate today = LocalDate.of(2017, 6, 8);

        System.out.println(today.getDayOfWeek());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        System.out.println(today.getDayOfYear());
    }
}
