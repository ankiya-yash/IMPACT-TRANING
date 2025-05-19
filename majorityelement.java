import java.util.Scanner;

class Main {
    static int majorityElement(int arr[], int size) {
        // Find the candidate for the majority element
        int candidate = arr[size / 2];
        int count = 0;

        // Count occurrences of the candidate
        for (int val : arr) {
            if (val == candidate) {
                count++;
            }
        }

        // Check if the candidate is the majority element
        if (count > size / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}

public class majorityelement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the method to find the majority element
        int res = Main.majorityElement(arr, size);

        if (res == -1) {
            System.out.println("No majority element");
        } else {
            System.out.println("Majority element is " + res);
        }

        sc.close();
    }
}