//Arrays demo 2
import java.util.Scanner;

public class App {
    //Instance variables (class level)
    private static int[] nums = null; 
    private static Scanner keys = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //number of terms to be entered - optionally could use user input
        System.out.print("How many numbers will you enter? ");
        int terms = keys.nextInt();
        //initialize the max
        nums = new int[terms];

        //Assign the values
        setNums();

        //Output
        printNums();

    }

    public static void setNums() {
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Please enter an integer: ");
            nums[i] = keys.nextInt();
        }
    }

    public static void printNums() {
        System.out.println("\n" + "The number inputted are as follows: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
}
