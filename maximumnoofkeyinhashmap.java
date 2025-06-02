import java.util.HashMap;
import java.util.Map;

public class maximumnoofkeyinhashmap {

    public static void main(String[] args) {
        HashMap<String,Integer> Bucket = new HashMap<>();
        Bucket.put("pen", 10);
        Bucket.put("Glass", 23);
        Bucket.put("Marker", 3);
        Bucket.put("laptop", 41);
        Bucket.put("fan", 5);
        System.out.println(Bucket);
        System.out.println("Number of keys: " + Bucket.size());
        // int maxValue = Collections.max(Bucket.values());
        // System.out.println("Maximum value: " + maxValue);

        int max = Integer.MIN_VALUE;
        String Bucket_name = "";
        for(Map.Entry<String, Integer> entry : Bucket.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                Bucket_name = entry.getKey();
            }
        }
        System.out.println(Bucket_name + " got " + max + " value");
    }
}
        