
import java.util.Scanner;

public class arrayfromrigth{
    public static void main(String[] args) {
        
        Scanner ip=new Scanner(System.in);

        int size = ip.nextInt();
        int[] arr = new int[size];

        for (int ind = 0 ; ind <size ; ind++){

            arr[ind]= ip.nextInt();
        }  

        for (int ind = size - 1; ind >= 0; ind--) {

            System.out.print(arr[ind] + ", ");
        }

        System.out.println();
        for (int ind= 0 ; ind<size ; ind++){

            System.out.println(arr[size-ind-1]+" ");
        }
 
        ip.close();
    }
}