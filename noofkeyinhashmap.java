//........To find the number of keys in the hash map.......

import java.util.HashMap;

public class noofkeyinhashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> Bucket = new HashMap<>();
        Bucket.put("pen", 1);
        Bucket.put("Glass", 2);
        Bucket.put("Marker", 3);
        Bucket.put("laptop", 4);
        Bucket.put("fan", 5);
        System.out.println(Bucket);
        System.out.println("Number of keys: " + Bucket.size());

        
    }
    
}
