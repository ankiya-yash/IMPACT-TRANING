public class findduplicateelement {
    public static void main(String[] args) {
        
        int[] arr = { 1,2,3,4,4};
        for (int i = 0; i<arr.length ;i++){
            for(int j=i+1 ;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("duplicte element is "+ arr[i]);
                }
                else {
                    System.out.println("element not found");
                }
            }
        }


    }

    
}
