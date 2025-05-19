import java.util.Scanner;

class Sec_Max_Ele {
    static int findSecMax(int[] arr, int size) {
        if (size < 2) {
            // If the array has less than 2 elements, second max cannot be found
            return Integer.MIN_VALUE; // Return a special value to indicate no second max
        }

        int max = arr[0], sec_max = Integer.MIN_VALUE;

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];
            } else if (arr[i] != max && arr[i] > sec_max) {
                sec_max = arr[i];
            }
        }

        return sec_max;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = ip.nextInt();

        if (size < 2) {
            System.out.println("Array must have at least 2 elements to find the second maximum.");
        } else {
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = ip.nextInt();
            }

            int res = findSecMax(arr, size);
            if (res == Integer.MIN_VALUE) {
                System.out.println("No second maximum element found.");
            } else {
                System.out.println("The second maximum element is: " + res);
            }
        }

        ip.close();
    }
}