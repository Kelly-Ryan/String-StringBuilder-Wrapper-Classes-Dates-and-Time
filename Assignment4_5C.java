/*
Assignment 4.5
Part C
Create a class named Assignment4_5C.java.
Create a two-dimensional array to store the following Strings.
green   white   orange
red     white   blue    yellow  black   green
 Display the values stored in the two-dimensional array, using a looping mechanism of your choice.
 */
public class Assignment4_5C {

    public static void main (String[] args) {

        String[][] colours = {{"green", "white", "orange"}, {"red", "white", "blue", "yellow", "black", "green"}};

        int i = 1;
        for(String[] inner : colours){
            System.out.print("Row " + i + "\t");
            for(String s : inner){
                System.out.print(s + "\t");
            }
            i++;
            System.out.println();
        }
    }
}
