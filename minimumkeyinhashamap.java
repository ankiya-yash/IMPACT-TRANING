import java.util.HashMap;
import java.util.Map;

public class minimumkeyinhashamap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("pen", 10);
        map.put("Glass", 23);
        map.put("Marker", 3);
        map.put("laptop", 41);
        map.put("fan", 5);

        int minValue = Integer.MAX_VALUE;
        String minKey = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
                minKey = entry.getKey();
            }
        }
        System.out.println("Key with minimum value: " + minKey + " (" + minValue + ")");
    }
}
