import java.util.Scanner;

public class findelementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String element = "A";
        int count = 0; 

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == element.charAt(0)) { 
                count++; 
            }
        }

        System.out.println("Occurrence of the element  " + count);
        sc.close();
    }
}