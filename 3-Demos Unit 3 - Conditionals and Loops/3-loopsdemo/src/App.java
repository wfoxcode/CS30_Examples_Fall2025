// Java Loops Demo
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //     int x = 10;
    //     while (x > 0) {
    //         System.out.println("Value: " + x);
    //         x--;
    //     }
    // //  for (start; end; step)
    //     for (int i = 10; i > 0; i--) {
    //         System.out.println("Value2: " + i);
    //     }

    Scanner inp = new Scanner(System.in);
    boolean running = true;
    while (running) {
        System.out.println("Your game code goes here");

        System.out.println("Type 1 to play again, 0 to exit the program.");
        String end = inp.nextLine();
        if (end.equals("0")) {
            running = false;
        }
        else if (!end.equals("1")) { /// ! makes this into NOT EQUALS
            System.out.println("That was not an option. Game will play again.");
        }
    }


    }
}
















