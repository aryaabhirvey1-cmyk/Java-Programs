// THE BELOW CODE SHOWS TO FIND FACTORS OF A GIVEN NUMBER WHICH WILL HELP US DETERMINE IF A NUMBER IS A PRIME NUMBER OR NOT
//-------------------------------------------------------------------------------------------------------------------------

public class Factors{
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);

        System.out.println("the factors of "+n+ " are: ");
        for(int i = 1 ; i< n ; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}