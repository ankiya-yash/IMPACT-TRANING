import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> Bucket = new HashSet<>();
        Bucket.add("Goldberg");
        Bucket.add( "Virat");
        Bucket.add( "thala");
        System.out.println(Bucket);
        if(Bucket.contains("Virat"))
        {
            Bucket.remove("Virat");
        }
        else{
            System.out.println("Absent");
        }
        System.out.println(Bucket);
        for(String e:Bucket)
        {
            System.out.println(e);
        }

         
    }
    
}
