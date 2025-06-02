import java.util.*;
class frequencyofstring {
    public static void main(String[] args) {

        // to find frequency of each character in a given string
        
        String str = "kskjdffiafdjosifsnnnnnnfdsaa";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}