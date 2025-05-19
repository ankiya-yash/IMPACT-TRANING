import java.util.Scanner;

public class reversepattern {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--) {
            
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }
        
            for(int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}