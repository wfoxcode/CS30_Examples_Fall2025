public class App {
    public static void main(String[] args) throws Exception {
        //Declaring the arrays
        int[] scores = null;
        String[] names = null;

        //Initialize the arrays
        scores = new int[5];
        names = new String[5];

        //Manually Assigning Values
        scores[0] = 100;
        names[0] = "John Doe";
        scores[1] = 98;
        names[1] = "Gerald";
        scores[2] = 95;
        names[2] = "Emily";
        scores[3] = 91;
        names[3] = "Sofia";
        scores[4] = 85;
        names[4] = "Mateo";  


        //Declare and Initialize at the same time
        int[] scoreAlt = {97,56,31,15,7,0};

        // Printing valeus accending
        for (int i = 0; i < scores.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }

        // Printing valeus decending
        //Start at len-1, end at 0 (inclusive)
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.println(names[i] + ": " + scores[i]);
        }

    }
}
