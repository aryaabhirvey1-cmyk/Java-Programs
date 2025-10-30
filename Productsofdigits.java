public class Productsofdigits{
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);
        int product = 1;
        int digit;
        while(n>0){
            digit = n%10;
            product = product*digit;
            n = n/10;
        }
        System.out.println(product);
    }
}