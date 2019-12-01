/*
Assignment4.9
Part A
Create a class named Assignment4_9A.java.
In the main method, create a StringBuilder object containing the String, "Learning Java is fun".
• Append the following String to the StringBuilder object. " and rewarding.".
Print the value of the StringBuilder object to the console.
• Insert the String, "programming ", after the word "Java ", in the StringBuilder object. Print the value of the StringBuilder object to the console.
• Delete the String "Java ", from the StringBuilder object.
Print the value of theStringBuilder object to the console.
• Reverse the value of the String stored in the StringBuilder object.
Print the value of the StringBuilder object to the console.
• Reverse the value again and call the toString() method of the StringBuilder object.
 */

public class Assignment4_9A {

    public static void main (String[] args) {

        StringBuilder sb = new StringBuilder("Learning Java is fun");
        sb.append(" and rewarding.");
        System.out.println(sb);

        sb.insert(14, "programming ");
        System.out.println(sb);

        sb.delete(9, 14);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb.toString());
    }
}
