import java.util.Scanner;

class Main {

    static void count_odd_even(int[] a, int n) {
        int odd = 0, even = 0;

        for (int val : a) {
            if (val % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odd: " + odd + ", Even: " + even);
    }
}

public class oddandeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the static method directly using the class name
        clacsumofarray.count_odd_even(arr, size);

        sc.close();
    }
}