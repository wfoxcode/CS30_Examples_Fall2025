import java.util.Scanner;
public class App {
    private static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //Employee joe = new Employee("Joe", 1, 30000);

        final int NUM_EMPLOYEES = 10; //final makes this a constant, not editable
        Employee[] employees = new Employee[NUM_EMPLOYEES];

        //populate the employee records
        for(int i = 0; i < employees.length; i++) {
            employees[i] = addEmp();
        }
    }

    public static Employee addEmp() {
        Employee newEmp = new Employee();  //Temp placeholder for new record

        System.out.print("Enter the employee name: ");
        newEmp.name = inp.nextLine();
        System.out.println("Enter the employee ID: ");
        newEmp.id = inp.nextInt();
        System.out.println("Enter the employee's salary: $");
        newEmp.salary = inp.nextInt();

        inp.nextLine(); // clear the input field

        return newEmp; //return the completed record
    }
}
