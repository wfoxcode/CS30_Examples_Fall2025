import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {5,8,2,9,12,56,743,2,-5};
        String fileName = "values.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < nums.length; i++) {
                writer.println(nums[i]);
            }
            System.out.println("Successfully written to " + fileName);
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
    }
}
