/*
Assignment 4.8
Part E
In 2017, the Wimbledon’s Men’s Tennis final is due to take place on the 16th July.
Create a class named, Assignment4_8E.java, which contains the main method. In main, create the following variable.

String mensTennisFinal = "07 16 2017";

Convert this String to a LocalDate object and display the output, as shown below.

"The 2017 Wimbledon Men's Tennis Final takes place on: 2017-07-16"

 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Assignment4_8E {

    public static void main (String[] args) {

        String mensTennisFinal = "07 16 2017";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse(mensTennisFinal, formatter);

        System.out.println("The 2017 Wimbledon Men's Tennis Final takes place on: " + date.format(DateTimeFormatter.ISO_LOCAL_DATE));

    }
}
