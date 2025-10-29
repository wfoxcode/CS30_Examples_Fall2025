public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        example1();
        example2();
    }

    // EXAMPLE 1 ---------------------------------------------
    // Basic structure of IF, ELSE IF, and ELSE conditioanl statements. 
    public static void example1() {
        int temp = 5;

        if (temp > 15) {
            System.out.println("Wear a t-shirt");
        }
        else if (temp > 0) {   //equivilant to elif
            System.out.println("wear a sweater");
        }
        else if (temp > -10) {
            System.out.println("wear a jacket");
        }
        else {
            System.out.println("Wear a parka");
        }
    } // end of ex1
    
    // EXAMPLE 2 ---------------------------------------------
    // Using boolean variables with conditionals, and using logical opperators.
    // Logical Op's are    && which is AND,  || which is OR,   ! which is NOT
    //              AND and OR require a left and right argument. NOT requires one argument to its right.
    // Comparative Op's are ==, !=, >=, <=, >, <
    // By the nature of boolean variables, writing "if (cleanedRoom)" is the same as "if (cleanedRoom == true)".
    public static void example2() {
        boolean cleanedRoom = true;
        boolean didHomework = false;

        if (cleanedRoom && didHomework) {
            System.out.println("You can go out");
        }
        else {
            System.out.println("No you can't");
        }
    
    } //end of ex2

} //end of class