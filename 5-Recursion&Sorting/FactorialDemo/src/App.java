public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("factorial");
            
    }

    public static int factorial(int n) {
        // BASE CASE        0! = 1
        if (n == 0) {
            return 1;
        }

        // GENERAL CASE     n! = n * (n-1)!
        else {
            return n * factorial(n-1);
        }

    }

}
