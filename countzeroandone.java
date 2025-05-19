import java.util.Scanner;

class Main {
    void count_zero_ones(int[] a, int n) {
        int zc = 0, oc = 0;
        for (int val : a) {
            if (val == 1)
                oc++;
            else
                zc++;
        }
        System.out.println("Zero count: " + zc + ", One count: " + oc);
    }
}

public class countzeroandone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Main obj = new Main();
        obj.count_zero_ones(arr, size);

        sc.close();
    }
}