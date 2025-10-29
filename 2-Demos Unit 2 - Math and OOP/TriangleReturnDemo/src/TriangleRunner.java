public class TriangleRunner {
    public static void main(String[] args) throws Exception {
        Triangle t1 = new Triangle(3,4,5);
        t1.view();
        System.out.println("The perimeter is " + t1.perimeter());

        t1.changeSides(7,8,9);
        t1.view();
    }
}
