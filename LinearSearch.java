import java.util.Scanner;

public class LinearSearch {

    // Method to perform linear search
    int linear_search(int[] arr, int key, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search:");
        int key = sc.nextInt();

        LinearSearch obj = new LinearSearch();
        int res = obj.linear_search(arr, key, size);

        
        if (res == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + res);
        }

        sc.close();
    }
}