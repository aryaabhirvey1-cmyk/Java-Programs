public class Pefectnum{
    public static void main(String[] args){
        int sum = 0 ;
        int n = Integer.parseInt(args[0]);
        int original = n;

        for(int i = 1; i<=n/2 ; i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        
        if(original == sum){
            System.out.println("is perfect number");
        }
        else{
            System.out.println("is not perfect number");
        }
    }
}