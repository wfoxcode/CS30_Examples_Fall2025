//  String Methods Demo

public class App {
    public static void main(String[] args) throws Exception {
        String msg1 = "This is a test message.";
        String msg2 = "Hello Computer Science 30!";

        System.out.println( msg1.length() );
        System.out.println( msg2.length() );

        System.out.println( msg1.substring(0, 3) );
        System.out.println( msg2.substring(5) );

        System.out.println( msg1.indexOf(" is ") );

        System.out.println( msg1.compareTo(msg2) );
        System.out.println( msg2.compareTo(msg1) );
        String word = "A";
        System.out.println( word.compareTo("Aaa") );

        System.out.println("");
        System.out.println( 5 == 5);
        System.out.println(word.equals("A"));





    }
}
