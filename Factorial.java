public class Factorial{
    public static void main(String[] args){
        // factorial of a given number 
        int n = Integer.parseInt(args[0]);

        //Initializing fact and setting value to 1 as it starts from 1
        int fact = 1;

        //Loops from i simuntanesly for each iteration it multiplies with n
        
        for(int i = 1 ; i<=n ; i++){
            fact = fact * i;
        }

        System.out.println("THE FACTORIAL OF "+n+" IS: "+fact);
    }
}