/*
Assignment 4.7
Part B
Create a Java program named, Assignment4_7B.java, which uses the LocalDate class to perform a number of date manipulations.
1. Use the LocalDate class to construct the following date: 2018-01-01
2. Add seven days to the date.
3. Add four weeks to the date.
4. Add six months to the date.
5. Add two years to the date.
 */

import java.time.LocalDate;

public class Assignment4_7B {

    public static void main(String[] args){

        //Q1
        LocalDate date = LocalDate.of(2018, 01, 01);

        System.out.println("Date Constructed: " + date);

        //Q2
        date = date.plusDays(7);
        System.out.println("Add Seven Days: " + date);

        //Q3
        date = date.plusWeeks(4);
        System.out.println("Add Four Weeks: " + date);

        //Q4
        date = date.plusMonths(6);
        System.out.println("Add Six Months: " + date);

        //Q5
        date = date.plusYears(2);
        System.out.println("Add Two Years: " + date);
    }
}
