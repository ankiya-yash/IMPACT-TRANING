
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> Bucket = new HashMap<>();
        Bucket.put("pen", 1);
        Bucket.put("Glass", 2);
        Bucket.put("Marker", 3);
        Bucket.put("laptop", 4);
        Bucket.put("fan", 5);
        System.out.println(Bucket);
        if(Bucket.containsKey("Glass"))
        {
            Bucket.remove("Glass");
        }
        else{
            System.out.println("Absent");
        }
        Bucket.put("pen", 45);
        System.out.println(Bucket); 
        for(String i : Bucket.keySet()){
            System.out.println(i);
        }

    }
    
}
