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
            int min = i; //Assume i is the lowest to start

            //locate the lowest value in unsorted part
            for (int j = i+1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {  //if J's value is lower, it is the new min
                    min = j;
                }
            }

            //Swap the values
            int temp = nums[min];   // store the min
            nums[min] = nums[i];    // move i to the middle of the array
            nums[i] = temp;         // place the min at position i

        }

        System.out.println(Arrays.toString(nums)); //prints out array in rough form

    } 
}
