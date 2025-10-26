public class Armstrong{
    public static void main(String[] args){
        int sum = 0 ;
        int n = Integer.parseInt(args[0]);
        int original = n;
        while(n != 0){
            int digit = n%10;
            sum = sum + digit * digit * digit;
            n = n/10;
        }

        if(original == sum){
            System.out.println("is armstrong");
        }
        else{
            System.out.println("is not armstrong");
        }
        
    }
}