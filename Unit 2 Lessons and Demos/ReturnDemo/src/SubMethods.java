public class SubMethods {
    private String name;

    public SubMethods() {       //Default Constructor
        name = "";
    }
    public SubMethods(String tempName) { //Initialization Constructor
        name = tempName;
    }
    public void setName(String tempName) { //Modifier Method
        name = tempName;
    }

    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }


}
