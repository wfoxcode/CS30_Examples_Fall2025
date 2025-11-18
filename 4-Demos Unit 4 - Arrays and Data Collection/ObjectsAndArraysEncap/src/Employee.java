public class Employee {
    private String name;
    private int id;
    private int salary;

    // Contstructor ---------------------------------------------
     public Employee(String tempName, int tempID, int tempSalary) {
        setName(tempName);
        setId(tempID);
        setSalary(tempSalary);
    }

    // Modifier Methods / Setters --------------------------------
    public void setName(String tempName) {
        name = tempName;
    }

    public void setId(int tempId) {
        id = tempId;
    }

    public void setSalary(int tempSalary) {
        salary = tempSalary;
    }

    // Accessor Method / Gettor

    public void print() {
        // System.out.println("The Employee Info is: " + name + ", " + id + ", $" + salary);

        //Alternative
        System.out.print("The Employee Info is: ");
        System.out.print(name + ", ");
        System.out.print(id + ", $");
        System.out.printf("%.2f", salary);
        System.out.print("\n");
    }



}
