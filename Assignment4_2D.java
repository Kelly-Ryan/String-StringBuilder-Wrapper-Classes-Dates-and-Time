/*
Assignment4.2
Part D
Create a class named, Assignment4_2D.
Define the following instance variable.
String b = " double trouble ";
Using method chaining, perform the following actions:
 Remove any leading and trailing whitespace.
 Replace the string trouble with the string bubble.
 Find and display the index position of the string, "bubble", in the newly created string.
 */
public class Assignment4_2D {

    public static void main (String[] args) {

        String b = " double trouble ";

        System.out.println("The index of the string \"bubble\" is: " + b.trim().replace("trouble", "bubble").indexOf("bubble"));
    }
}
