public class Palindrome{
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);
        int original = n;
        int digit;
        int sum = 0;
        int rev = 0;
        while(n != 0){
            digit = n%10;
            rev = rev *10 + digit;
            n = n/10;
        }
        System.out.println(rev);

        if(original == rev){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("is not palindrome");
        }
    }
}