import java.util.Scanner;

class SumOfElementOfArray {

    // Method to calculate the sum of elements in the array
    static int calcsumofeles(int[] arr, int size) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in); // Added missing semicolon
        System.out.println("Enter the size of the array:");
        int size = ip.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = ip.nextInt();
        }

        // Call the method to calculate the sum of elements
        int res = calcsumofeles(arr, size);
        System.out.println("The sum of the elements of the array is: " + res);

        ip.close();
    }
}