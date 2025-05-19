
import java.util.Scanner;

public class towerpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ;i++){
            for(int j = n ; j>i; j--){
                System.out.print(" ");

            }
            for(int k = i ; k<=(i*2-1);k++){

                System.out.print(k);
            }
            for(int l = (i-1)*2;l>=i;l--){
                System.out.print(l);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
