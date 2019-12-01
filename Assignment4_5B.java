/*
Assignment 4.5
Part B
Create a class named, Assignment4_5B.java, to store the temperatures recorded in Ireland for the last two years.
Use a two-dimensional array to store the figures.
 (1): Use standard for loops to display the values stored.
 (2): Use enhanced for loops to display the values stored.
 */
public class Assignment4_5B {

    public static void main (String[] args) {

        double[][] temperatures = {{9.0, 9.1, 11.2, 12.0, 14.1, 18.0, 23.0, 21.1, 20.0, 13.0, 10.1, 9.0},
                                    {8.0, 8.1, 10.2, 11.0, 14.1, 17.0, 22.0, 22.1, 21.0, 12.0, 11.1, 8.0}};

        System.out.println("Standard For Loop");

        for(int i = 0; i < 2; i++){
            System.out.println("Year " + (i + 1));
            for(int j  = 0; j < 12; j++){
                System.out.print(temperatures[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Enhanced For Loop");
        int i = 1;
        for(double[] inner : temperatures){

            System.out.println("Year " + i);
            i++;

            for(double d : inner){
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}
