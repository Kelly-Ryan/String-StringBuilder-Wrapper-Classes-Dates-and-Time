/*
Assignment 4.6
Part A
Create a class named Assignment4_6A.java.
Create an ArrayList to store the names of the following film stars. The data type of the ArrayList is String.
 Elvis Presley
 Marilyn Monroe
 James Dean
 Rita Davies
Complete the following actions, making use of the methods found in the ArrayList object.
1. Cary Grant should be added to the list at index position two.
2. Determine if Marilyn Monroe is included in the list.
3. Display the name of the actor stored at index position four of the list.
4. At what index position of the list, is James Dean stored?
5. Remove Rita Davies from the list.
6. Display the new contents of the ArrayList.
 */

import java.util.ArrayList;
import java.util.List;

public class Assignment4_6A {

    public static void main (String[] args) {

        List<String> filmStars = new ArrayList<String>();
        filmStars.add("Elvis Presley");
        filmStars.add("Marilyn Monroe");
        filmStars.add("James Dean");
        filmStars.add("Rita Davies");

        filmStars.add(2, "Cary Grant");

        System.out.println("Is Marilyn Monroe in the list? " + filmStars.contains("Marilyn Monroe"));
        System.out.println("At index position four of the list is: " + filmStars.get(4));
        System.out.println("James Dean is at index position: " + filmStars.indexOf("James Dean"));

        filmStars.remove("Rita Davies");

        System.out.println("\nPrinting the contents of the ArrayList:");
        for(String s : filmStars){
            System.out.println(s + " ");
        }

    }
}
