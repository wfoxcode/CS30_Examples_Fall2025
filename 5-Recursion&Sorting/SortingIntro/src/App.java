import java.util.Random;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(50);
        }
        System.out.println(Arrays.toString(nums)); //prints out array in rough form
        // ------------------------------------------------
        


    } 
}
