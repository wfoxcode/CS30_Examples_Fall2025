import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random r = new Random();

        int[][] nums = new int[10][10];

        //populate the array
        for (int col = 0; col < nums.length; col++) {
            for (int row = 0; row < nums[col].length; row++) {
                nums[col][row] = r.nextInt(100);
            }
        }

        for (int col = 0 ; col < nums.length; col++) {
            for (int row = 0; row < nums[col].length; row++) {
                System.out.print(nums[col][row] + ",\t");
            }
            System.out.print("\n");
        }




    }
}





