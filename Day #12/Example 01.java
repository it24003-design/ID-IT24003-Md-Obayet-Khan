import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Mango", 70);

        Access value        System.out.println("Price of Apple: " + map.get("Apple"));

        System.out.println(map);
    }
}
