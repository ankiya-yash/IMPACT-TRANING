public class findprefectsquar {

    public static void main(String[] args) {
        
        int num = 25;
        int sqrt = (int)Math.sqrt(num);
        if(sqrt * sqrt ==num){
            
            System.out.println("it is a prefect square  " +  num);

        }
        else{
            System.out.println("it is not a prefect square  " + num);
        }
    }
    
}
