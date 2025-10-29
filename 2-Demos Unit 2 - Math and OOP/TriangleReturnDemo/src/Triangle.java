public class Triangle {
    private double sideA, sideB, sideC;

    // Default Constructor
    public Triangle() {
        changeSides(0,0,0);
    }

    // Initialization Constructor
    public Triangle(double tempA, double tempB, double tempC) {
        changeSides(tempA, tempB, tempC);
    }

    //Modifier Method to set side values
    public void changeSides(double tempA, double tempB, double tempC) {
        sideA = tempA;
        sideB = tempB;
        sideC = tempC;
    }

    //View Stats
    public void view() {
        System.out.println("The values are...Side A " + sideA + ", Side B " + sideB + ", Side C " + sideC);
    }

    public double perimeter() {
        double result = sideA + sideB + sideC;
        return result;
    }

    public double area() {
        //would need tan for the height
        return 0;
    }

}
