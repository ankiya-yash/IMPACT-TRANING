public class TwoDArrayPattern {
    public static void main(String[] args) {
        int arr [][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { 
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } else if (i == 1) { 
                for (int j = 0; j < arr[i].length - 1; j++) {
                    System.out.print("  ");
                }
                System.out.println(arr[i][arr[i].length - 1]);
            } else if (i == 3) {  
                System.out.println(arr[i][0]);
            }
        }
    }
}