import java.util.HashMap;

public class App {
    private static HashMap<String, String> capitalCities = new HashMap<>();
    public static void main(String[] args) throws Exception {
        
        capitalCities.put("England", "London");
        capitalCities.put("Canada", "Ottawa");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("France", "Paris");
        System.out.println(capitalCities);

        capitalCities.put("USA", "DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("Canada"));
        
    }
}
