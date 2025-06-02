

public class semetric2darray {
    public static void main(String[] args) {
        int [][] matrix = {
            {1, 2, 3},
            {3, 2, 3},
            {1, 2, 1}
        };
        
        int c= 0;
        int m = matrix.length;
        int n = matrix.length;
        if(m!=n){
            System.out.println("Flase");
            return;
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] != matrix[j][i]){
                    c++;
                }
            }

        }
        if(c<0){
            System.out.println("Flase");
        }
        else{
            System.out.println("true");
        }

    }
}