 
import java.util.Scanner;

public class factorialofanumberrecurssion {

    static int Factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial(n));
        sc.close();
        
    }
}
