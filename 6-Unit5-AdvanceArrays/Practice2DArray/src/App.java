//
//
//
// Program name: A18 Working with 2D Arrays

import java.util.Random;
import java.util.Scanner;

public class App {
    // Instance Variables and Objects
    private static Scanner keys = new Scanner(System.in);  // input scanner object
    private static Random rdm = new Random();              // random number object

    public static void main(String[] args) throws Exception {
        boolean running = true;         // game loop trigger variable
        int[][] nums = {                // the nums array
                        {1,1,1,1,1},
                        {2,2,2,2,2},
                        {3,3,3,3,3},
                        {4,4,4,4,4},
                        {5,5,5,5,5}
                        };

        while (running) {
            System.out.println("Welcome to the number parser. Please choose one of the following options: ");
            System.out.print( "\t1) Print Array \n" +
                                "\t2) Sum Array \n" +
                                "\t3) Count Negatives \n" + 
                                "\t4) Quit Program\n");
            System.out.print("Enter your choice: ");
            String option = keys.next();

            // ** YOUR TURN **
            // Add your function calls and/or any required print statements
            if (option.equals("1")) { //Print array
                
            }
            else if (option.equals("2")) { //Sum array

            }
            else if (option.equals("3")) { //Count negatives

            }
            else if (option.equals("4")) { //Quit program

            }
            else {
                System.out.println("That was not a valid option.");
            }

            System.out.print("\n");
        }

    }

    // ******YOUR TURN******
    //Complete the following functions for your program:

    // Create a function to print the given array
    public static void printArray(int[][] arr) {

    }

    //Create a function that returns the sum of the elements in the given array
    public static void sumArray(int[][] arr) {

    }

    //Create a function that returns the count of negatives in the given array
    public static int countNeg(int[][] arr) {
        
        return 0; //replace with your return
    }

} //end class
