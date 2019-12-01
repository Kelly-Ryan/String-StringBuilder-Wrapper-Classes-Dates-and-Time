/*
Assignment 4.4
Part A
Create a class named, Assignment4_4A.java.
Create an array named, smallNos, to store the following byte literal values.
 127,100,45,23,60
 Sort the contents of the array in ascending order.
 Display the contents of the array in the console.
 */

import java.util.Arrays;

public class Assignment4_4A {

    public static void main (String[] args) {

        byte[] smallNos = {127,100,45,23,60};
        Arrays.sort(smallNos);

        for (byte s : smallNos) {

            System.out.print(s + " ");
        }

    }
}
