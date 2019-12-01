/*
Assignment 4.2
Part B
Create a class named, Assignment4_2B. The class should contain one instance variable named message, of type String, to contain the following text.
String message = "One, two, buckle my shoe";
In the main method, use the appropriate methods of the String class, to answer the following questions.
 At what index position in the string variable, message, will you find the string, “buckle"?
 Determine if the string variable, message, ends with the string, "shoe"?
 In the string variable, message, extract the character at index position 2.
 */

public class Assignment4_2B {

    public static void main (String[] args) {

        String message = "One, two, buckle my shoe";

        System.out.println("\"buckle\" is found at index position: " + message.indexOf("buckle"));
        System.out.println("String ends with \"shoe\"? " + message.endsWith("shoe"));
        System.out.println("Character at index position 2 is: " + message.charAt(2));

    }
}
