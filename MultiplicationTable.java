public class MultiplicationTable{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);


        System.out.println("The Multiplication table for "+n+ " is: ");
        for(int i = 0 ; i<=10 ; i++){
            System.out.println(n +" * "+i+ " = " + n*i);
        }
    }
}