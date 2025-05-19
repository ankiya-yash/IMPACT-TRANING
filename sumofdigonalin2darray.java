public class sumofdigonalin2darray {
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int add = 0;
        int m = matrix.length;
        for(int i=0;i<m;i++){
            for(int j = 0;j<m;j++){
                if((i+j)%2==0){
                    add = add+matrix[i][j];
                    System.out.println(matrix[i][j]);
                }
            }
        }
        System.out.println(add);
    }
    
}
