import java.util.Scanner;

public class binarysearch {

    // Method to perform binary search
    static int binarySearch(int[] arr, int key, int size) {
        int left = 0, right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the key is at mid
            if (arr[mid] == key) {
                return mid; // Return the index of the key
            }

            // If the key is smaller than mid, search in the left half
            if (arr[mid] > key) {
                right = mid - 1;
            }
            // If the key is larger than mid, search in the right half
            else {
                left = mid + 1;
            }
        }

        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the key to search for
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();

        // Call the binary search method
        int res = binarySearch(arr, key, size);

        // Output the result
        if (res == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + res);
        }

        sc.close();
    }
}