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

        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++){
                if (nums[j-1] > nums[j]) { //SWAP
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums)); //prints out array in rough form

    } 
}
