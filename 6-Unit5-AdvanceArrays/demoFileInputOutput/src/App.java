import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        String[] names = new String[5];

        names = userCreateList(names);
        printNamesList(names);

    } // end of main method -------

    public static String[] userCreateList(String[] names) {
        Scanner keys = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Please enter the name: ");
            names[i] = keys.nextLine();
        }
        return names;
    } // end of create method

    public static void printNamesList(String[] names) {
        System.out.println("The names recorded are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println("- " + names[i]);
        }
        System.out.println();
    }


} // end of class -------------------------------
