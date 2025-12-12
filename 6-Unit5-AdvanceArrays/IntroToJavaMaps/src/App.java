import java.util.HashMap;
import java.util.Scanner;

public class App {
    private static Scanner keys = new Scanner(System.in);
    private static HashMap<String, String> capitalCities = new HashMap<>();
    public static void main(String[] args) throws Exception {
        //capitals(); //Capital city example
        peopleExample();
        
    }

    public static void peopleExample() {
        HashMap<String, Integer> people = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a name: ");
            String name = keys.nextLine();
            System.out.print("Please enter their age: ");
            int age = keys.nextInt();

            people.put(name.toLowerCase(), age);
            keys.nextLine(); //clear the input stream
            System.out.println(); //adds an empty line between inputs
        }

        // Print out the hashmap --> use a for each
        for (String key : people.keySet()) {
            System.out.println(key + "'s age is " + people.get(key) );
        }

        System.out.println(); //paragraph space
        System.out.print("Enter a name to retrieve the age: " );
        String name = keys.nextLine();
        if (people.containsKey(name)) {
            System.out.println(name + "'s age is " + people.get(name));
        }
        else {
            System.out.println("That name does not exist.");
        }


    } //end of peopleExample ----------------










    public static void capitals() {
        capitalCities.put("England", "London");
        capitalCities.put("Canada", "Ottawa");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("France", "Paris");
        System.out.println(capitalCities);

        capitalCities.put("USA", "DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("Canada"));
        System.out.println(capitalCities.get("France"));

        capitalCities.put("canada", "Toronto");
        System.out.println(capitalCities);

        capitalCities.remove("canada");
    }


} //end of main class -------------------------------------
