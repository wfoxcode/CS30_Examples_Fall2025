import java.util.Scanner; //You need to import the library per file

public class SecondaryClass {
    private Scanner inp2 = new Scanner(System.in);
    private int num;

    public void setNums(int tempNum) {
        num = tempNum;
    }

    public void promptNums() {
        num = inp2.nextInt();
    }

}
