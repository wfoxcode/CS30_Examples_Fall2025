import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        SecondaryClass test = new SecondaryClass();

        System.out.println("Enter a number");
        int usernum = inp.nextInt();

        test.setNums(usernum);

        
    }
}
