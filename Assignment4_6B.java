/*
Assignment4_6B
Part B

Create a class named CD.
The class should contain the following members.

Instance Variables
 private String name;
 private String artist;
 private String yearReleased;
 private String recordLabel;

Constructor
 One constructor should be created to accept four arguments.

Methods
 Accessor Methods (setters and getters) should be set for each of the instance variables.

 The equals() method should be overridden to allow two CD objects to be considered equal. Assume that two CD objects are considered equal, if they have the same (album) name (if you are unfamiliar with the equals() method, defined in class Object, you may need to do some external research).

 The toString() method should also be overridden appropriately.

Create a class named Assignment4_6B.java.
In the main method, create an ArrayList object and complete the following steps.
 Step 1: Create the following two objects and add them to the ArrayList

Album                           Artist  Year Released   Record Label
Rattle and Hum                  U2          1988       Island Records
The Dark Side of the Moon   Pink Floyd      1973       Capitol Records

Step 2: Create the following object and add it to index position one of the ArrayList.

Album                           Artist          Year Released              Record Label
The Very Best Of Fleetwood Mac  Fleetwood Mac       2002             Warner Bros. Records

Step 3: Create the following object and add it to index position two of the ArrayList.

Album                                   Artist      Year Released       Record Label
Alanis Morissette: The Collection  Alanis Morissette    2005                Maverick

Step 4: Determine if the album, ‘The Very Best of Fleetwood Mac', is stored in the ArrayList.
 Step 5: Return details of the album stored at index position 3 of the ArrayList.
 Step 6: Remove the album, ‘The Very Best of Fleetwood Mac' from the ArrayList.
 Step 7: Display the number of albums stored in the ArrayList.
 Step 8: Display the contents of the ArrayList.

 */
import java.util.ArrayList;

public class Assignment4_6B {

    public static void main (String[] args) {

        ArrayList<CD> albums = new ArrayList<CD>();

        //Step 1
        albums.add(new CD("Rattle and Hum", "U2", "1988", "Island Records"));
        albums.add(new CD("The Dark Side of the Moon", "Pink Floyd", "1973", "Capitol Records"));

        //Step 2
        albums.add(1, new CD("The Very Best of Fleetwood Mac", "Fleetwood Mac", "2002", "Warner Bros. Records"));

        //Step 3
        albums.add(2, new CD("Alanis Morissette: The Collection", "Alanis Morissette", "2005", "Maverick"));

        //Step 4
        System.out.println("Step 4\nIs \"The Very Best of Fleetwood Mac\" in the ArrayList? " + albums.contains(new CD("The Very Best of Fleetwood Mac", "Fleetwood Mac", "2002", "Warner Bros. Records")));

        //Step 5
        System.out.println("\nStep 5\nThe details of the album at index position 3 are: \n" + albums.get(3).toString());

        //Step 6
        albums.remove(new CD("The Very Best of Fleetwood Mac", "Fleetwood Mac", "2002", "Warner Bros. Records"));

        //Step 7
        System.out.println("\nStep 7\nThe number of albums stored in the ArrayList is: " + albums.size());

        //Step 8
        System.out.println("\nStep 8\nPrinting the contents of the ArrayList: \n");
        for(CD cd : albums){
            System.out.println(cd);
        }
    }

}
