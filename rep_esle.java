import java.util.Scanner;

class rep_esle {

    static void replace_ele(long[] arr, int size) {
        long sum = 0;
        for (long val : arr) {
            sum += val;
        }
        for (int i = 0; i < size; i++) {
            arr[i] = sum - arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = ip.nextInt(); // Changed to int
        long[] arr = new long[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = ip.nextLong();
        }

        replace_ele(arr, size);

        System.out.println("Modified array:");
        for (long val : arr) {
            System.out.print(val + " "); // Changed to print for same-line output
        }
        System.out.println(); // Move to the next line after printing the array

        ip.close();
    }
}