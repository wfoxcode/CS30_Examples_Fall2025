public class App {
    public static void main(String[] args) throws Exception {
        int width = 10;
        int height = 10;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(x + "" + y + " ");
            }
            System.out.println("end");
        }



    }
}
