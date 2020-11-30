import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println("HashMap: " + capitalCities);

        System.out.println("Value of England: " + capitalCities.get("England"));
        System.out.println("Size of Map : " + capitalCities.size());

        // Print keys
        System.out.print("Keys of Map : ");
        for (String i : capitalCities.keySet()) {
            System.out.print(i + " ");
        }
        // print values
        System.out.print("\nValues of Map: ");
        for (String i : capitalCities.values()) {
            System.out.print(i + " ");
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}