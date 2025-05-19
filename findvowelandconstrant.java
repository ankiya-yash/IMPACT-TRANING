public class findvowelandconstrant {
    public static void main(String[] args) {
        String a = "helloworld";
        int vowels = 0, consonants = 0;

        
        a = a.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
           
            else if (c >= 'a' && c <= 'z') {
                consonants++;
                System.out.println("Consonant found: " + c);
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}