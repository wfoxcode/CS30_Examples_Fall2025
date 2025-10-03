// Scanner and Input Demo
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        // System.out.println("Enter an string::");
        // String inp = keys.nextLine();
        // System.out.println("You entered: " + inp);

        int age;
        String name;
        System.out.println("Welcome to the Friday Demo. Please enter the details below.");
        
        System.out.print("Please enter your age: ");
        age = keys.nextInt();
        keys.nextLine(); // Clears the whitespace

        System.out.print("Please enter your full name: ");
        name = keys.nextLine();

        System.out.println("Welcome, " + name + ", human of age " + age);






    }
}
