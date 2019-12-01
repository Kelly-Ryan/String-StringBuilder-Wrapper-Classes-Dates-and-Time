/*
Assignment 4.8
Part A

 */

import java.time.LocalDate;
import java.time.Period;

public class Assignment4_8A {

    public static void main (String[] args) {

        LocalDate start = LocalDate.of(2017,1,1);
        LocalDate end = LocalDate.of(2017, 12,2);
        Period month = Period.ofMonths(1);
        Period sixMonths = Period.ofMonths(6);
        LocalDate current = start;

        while (current.isBefore(end)) {
            System.out.println(current);
            current = current.plus(month);
        }

        System.out.println("***************");

        current = end;

        while (current.isAfter(start)) {
            System.out.println(current);
            current = current.minus(month);
        }

        System.out.println("***************");

        current = start;

        while (current.isBefore(end)) {
            System.out.println(current);
            current = current.plus(sixMonths);
        }
    }
}
