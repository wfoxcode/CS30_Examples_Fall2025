public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {9,5,61,281,-7,56,-1000,200,878};
        //Count the number of negatives
        int countNeg = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                countNeg++;
            }
        }

        // initialize and populate new array
        int newNums[] = new int[nums.length - countNeg];
        int skipped = 0; //new counter
        for (int i = 0; i < nums.length; i++) {
            // Non target values get transfered
            if (nums[i] >= 0) { 
                newNums[i - skipped] = nums[i];
            }
            //Target value gets skipped
            else {
                skipped++;
            }
        }

    }
}
