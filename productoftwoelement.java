public class productoftwoelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int maxProduct = 0;
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }

        System.out.println("Maximum product is " + maxProduct + " from elements " + num1 + " and " + num2);
    }
}