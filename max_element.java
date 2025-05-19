
import java.util.Scanner;

class max_element {

    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        System.out.println("Enter the array:");
        int size = ip.nextInt();
        int[] arr = new int[size];

        for (int i=0 ; i<size ; i++){             
            arr[i]=ip.nextInt();
        }
        // int max = 0;
        // for(int val: arr){
        //     if(val>max){
        //         max=val;
        //     }
        // }
        // System.out.println("the max element is "+ max);

        // int max = Integer.MIN_VALUE;
        // for (int val : arr){
        //     if (val>max){
        //         max= val;
        //     }
        // }

        // way 2

        int max = arr[0];
        for(int i = 0 ; i<size ; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("the max element is:" +max);
    ip.close();    
        
    }
}
