import java.util.Scanner;
public class App {
    private static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //Employee joe = new Employee("Joe", 1, 30000);

        final int NUM_EMPLOYEES = 3; //final makes this a constant, not editable
        Employee[] employees = new Employee[NUM_EMPLOYEES];

        //populate the employee records
        for(int i = 0; i < employees.length; i++) {
            employees[i] = addEmp();
        }
    }

    public static Employee addEmp() {
        // Employee newEmp = new Employee("", 0, 0);  //Temp placeholder for new record

        System.out.print("Enter the employee name: ");
        String name = inp.nextLine();
        System.out.println("Enter the employee ID: ");
        int id = inp.nextInt();
        System.out.println("Enter the employee's salary: $");
        int salary = inp.nextInt();

        inp.nextLine(); // clear the input field

        return new Employee(name, id, salary); //return the completed record
    }
}
