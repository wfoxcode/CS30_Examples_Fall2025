import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        String[] names = new String[5];
        String fileName = "names.txt";

        names = userCreateList(names);
        printNamesList(names);
        saveListToFile(names, fileName);


    } // end of main method ----------------------------------------

    public static String[] userCreateList(String[] names) {
        Scanner keys = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Please enter the name: ");
            names[i] = keys.nextLine();
        }
        System.out.println();
        return names;
    } // end of create method ----------------------------------------

    public static void printNamesList(String[] names) {
        System.out.println("The names recorded are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println("- " + names[i]);
        }
        System.out.println();
    } //end of print method -----------------------------------

    public static void saveListToFile(String[] names, String file) {

        try ( PrintWriter writer = new PrintWriter( new FileWriter(file))) {
            for (int i = 0; i < names.length; i++) {
                writer.println(names[i]);
            }
            System.out.println("File save was successful.");
        } catch (Exception e) {
            System.out.println("An error occured while writing to file.");
            e.printStackTrace();
        }

        System.out.println();
    } //end of save method ---------------------------------------------------


} // end of class -------------------------------
