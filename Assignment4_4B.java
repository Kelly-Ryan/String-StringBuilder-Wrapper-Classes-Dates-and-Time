/*
Assignment 4.4
Part B
Create a class named, Assignment4_4B.java.
Create an array named, numbers, to store the following int literal values.
 34,67,23,180
Search for the index position of the number 67 in the array.
 */
import java.util.Arrays;

public class Assignment4_4B {

    public static void main (String[] args) {

        int[] numbers = {34,67,23,180};
        Arrays.sort(numbers);
        System.out.println("No. 67 is found at index position: " + Arrays.binarySearch(numbers, 67));
    }
}
