public class Employee {
    public String name;
    public int id;
    public int salary;

    public Employee() {
        name = "";
        id = 0;
        salary = 0;
    }

    public Employee(String tempName, int tempID, int tempSalary) {
        name = tempName;
        id = tempID;
        salary = tempSalary;
    }

}
