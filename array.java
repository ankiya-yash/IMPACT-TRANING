import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Using for loop:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " "); // Use print instead of println for same-line output
        }
        System.out.println(); // Move to the next line

        System.out.println("Using for-each loop:");
        for (int val : arr) {
            System.out.print(val + " "); // Use print instead of println for same-line output
        }
        System.out.println(); // Move to the next line

        System.out.println("Array class: " + arr.getClass());
        System.out.println("Scanner class: " + sc.getClass());

        sc.close();
    }
}