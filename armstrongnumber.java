import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;

        // Calculate the number of digits
        int digits = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Check if the number is an Armstrong number
        temp = number;
        while (temp != 0) {
            int remainder = temp % 10;
            result += Math.pow(remainder, digits);
            temp /= 10;
        }

        if (result == originalNumber) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close();
    }
}