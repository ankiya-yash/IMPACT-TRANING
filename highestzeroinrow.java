public class highestzeroinrow {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 0},
            {2, 0, 0},
            {1, 2, 0}
        };
        int max = -1, idx = -1;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int val : matrix[i]) if (val == 0) count++;
            if (count > max) { max = count; idx = i; }
        }
        System.out.println(idx);
    }
}