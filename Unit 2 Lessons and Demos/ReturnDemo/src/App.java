public class App {
    public static void main(String[] args) throws Exception {
        SubMethods p1 = new SubMethods("bob");
        SubMethods p2 = new SubMethods();
        p2.setName("Ryan Reynolds");

        p1.printName();
        p2.printName();

        System.out.println( "Hello there, " + p1.getName() );
    }
}
