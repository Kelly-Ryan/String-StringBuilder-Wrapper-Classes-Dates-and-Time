/*
Assignment 4.2
Part A
Create a class named, Assignment4_2A. The class should contain one instance variable named message, of type String, to contain the following text.
String message = "Duke's big day out!";
In the main method, use the appropriate methods of the String class, to answer the following questions.
 Is the string "big", contained in the string, "Duke's big day out!"? Print the result to the console.
 Extract the string "big", from the string, "Duke's big day out!". Print the extracted string in the console.
 Replace the string "big", in the string, "Duke's big day out!" with the string "magical". Print the value of the new string to the console.
 */

public class Assignment4_2A {

    public static void main (String[] args) {

        String message = "Duke's big day out!";

        System.out.println("Is the string \"big\", contained in the string, \"Duke's big day out!\"? Ans: " + message.contains("big"));
        System.out.println("Extract the string \"big\", from the string, \"Duke's big day out!\". Ans: " + message.substring(7, 10));
        System.out.println("Replace the string \"big\", in the string, \"Duke's big day out!\" with the string \"magical\". Ans: " + message.replace("big", "magical"));

    }
}
