/*
Assignment 4.10
Part A

Create a class named, Assignment4_10A.java.

In the main method:

 Store the following numbers in an ArrayList (named numbers).
o 7,17,27.
o Which data type in the ArrayList declaration should be specified?

 Create a string named fortySeven, which stores the value, "47".

 Parse the string to an int and add it to the ArrayList.

 Next, convert the literal string "57", to an Integer wrapper object and add it to the ArrayList.

 Finally, convert the ArrayList to an array, and output its contents using an enhanced for loop.
 */
import java.util.ArrayList;
import java.util.List;

public class Assignment4_10A {

    public static void main (String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(17);
        numbers.add(27);

        String fortySeven = "47";
        numbers.add(Integer.parseInt(fortySeven));
        numbers.add(Integer.valueOf("57"));

        Integer[] array = numbers.toArray(new Integer [5]);

        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
    }
}
