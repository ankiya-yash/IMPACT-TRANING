
import java.util.Scanner;

public class clacfactorial {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println("Factorial of " + num + " is: " + fact(num));
    }
}