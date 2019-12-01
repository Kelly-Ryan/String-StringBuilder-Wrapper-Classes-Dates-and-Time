/*
Assignment 4.5
Part A
Create a class named, Assignment4_5A.java.
A company wants to store the following quarterly sales forecasts for the next three-year period.

Year 1
Q1  12000
Q2  13000
Q3  14000
Q4  15000

Year 2
Q1  13000
Q2  14000
Q3  15000
Q4  16000

Year 3
Q1  10000
Q2  12000
Q3  15000
Q4  13000

 Use a two-dimensional array to store the figures.
 Use standard for loops to display the values stored.
 */

public class Assignment4_5A {

    public static void main (String[] args) {

        int[][] quarterlySales = {{12000, 13000, 14000, 15000}, {13000, 14000, 15000, 16000}, {10000, 12000, 15000, 13000}};

        for (int i = 0; i < 3; i ++) {
            System.out.println("Year " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print(quarterlySales[i][j] + " ");
            }

            System.out.println();
        }
    }
}
