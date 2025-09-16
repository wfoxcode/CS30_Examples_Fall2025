// String Methods Refresher Tuesday

public class App {
    public static void main(String[] args) throws Exception {
        String msg = "Good Morning Miller Students!";

        int pos = msg.indexOf("Miller");
        int len = "Miller".length();
        String msgout = msg.substring(0, pos) + msg.substring(pos + len + 1);
        System.out.println(msgout);

    }
}