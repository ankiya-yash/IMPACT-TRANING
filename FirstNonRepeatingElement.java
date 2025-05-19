public class FirstNonRepeatingElement {
    
//----------------------To find First Non Repeating Element in Array.-------------------------------------
    
    public static void main(String[] args) {
        int[] arr={6,5,2,3,4,2,3,4,5};
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i != j && arr[i]==arr[j]){
                count++;
                break;
                }
            }

            if(count==0){
                System.out.println(arr[i]);
            }
        }
    }
}