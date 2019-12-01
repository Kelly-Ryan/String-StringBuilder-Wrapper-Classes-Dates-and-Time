/*
Assignment 4.3
Part B

Create a source code file named, Assignment4_3B.java.
The source code file should contain the following two classes:
 public class Assignment4_3B
 class Friend

Class Friend, should contain the following instance variables:
 private String firstName;
 private String lastName;
 private String phoneNo;
 private String emailAddress;

Constructor

public Friend(String firstName, String lastName, String phoneNo, String emailAddress)

Methods
public String toString()

The main method should be declared in class Assignment4_3B. In the main method, create the following objects of type Friend.
Use an array to store the two Friend object references created. Declare, create and initialise the array in one statement.
Use a standard for loop, to call the toString() method of each object stored.
 */
public class Assignment4_3B {

    public static void main (String[] args) {

        Friend[] friends = {new Friend("Sandy", "Smith", "0864545321", "sandysmith@livemail.com"),
                            new Friend("Ben", "Jones", "0864152412", "jonesben@livemail.com")};

        for (Friend f : friends) {

            System.out.println(f.toString());
        }

    }
}


class Friend {

    private String firstName;
    private String lastName;
    private String phoneNo;
    private String emailAddress;

    public Friend(String firstName, String lastName, String phoneNo, String emailAddress){

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.emailAddress = emailAddress;

    }

    public String toString(){

        return  "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Phone No.: " + phoneNo + "\n" + "Email: " + emailAddress + "\n";
    }
}