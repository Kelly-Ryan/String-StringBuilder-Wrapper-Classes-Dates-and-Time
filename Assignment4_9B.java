/*
Assignment4.9
Part B
Create a class named Assignment4_9B.java.
In the main method, create a StringBuilder object containing the String, "John is a famous pop star"
• Insert the String, "McCartney ", after the word "John ", in the StringBuilder object. Display the value stored in the StringBuilder object in the console.
• Append the String, " and former member of the Beatles group.", to the existing StringBuilder. Display the value stored in the StringBuilder object in the console.
• Delete the String "pop", in the StringBuilder. Display the value stored in the StringBuilder object in the console.
• Reverse the contents of the StringBuilder and display the new value in the console.
 */
public class Assignment4_9B {

    public static void main (String[] args) {

        StringBuilder sb = new StringBuilder("John is a famous pop star");
        sb.insert(5, "McCartney ");
        System.out.println(sb);

        sb.append(" and a former member of The Beatles group.");
        System.out.println(sb);

        sb.delete(27, 30);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
