public class clacsumofarray {

    
    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

   
    static int[] generateResultArray(int[] arr, int totalSum) {
        int[] result = new int[arr.length];
        int cumulativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];
            result[i] = totalSum - cumulativeSum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int totalSum = calculateSum(arr);

        int[] result = generateResultArray(arr, totalSum);
        System.out.print("Result array: {");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
