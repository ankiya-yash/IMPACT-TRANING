import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("Enter element to search: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                if (a[i][j] == x) {
                    System.out.println("Found at (" + i + "," + j + ")");
                    return;
                }

        System.out.println("Not found");
    }
}
