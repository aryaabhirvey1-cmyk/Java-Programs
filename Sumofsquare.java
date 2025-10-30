public class Sumofsquare{
    public static void main(String[] args){

        // sum of squares from 1 to give number n
        int n = Integer.parseInt(args[0]);
        int square = 1;
        for(int i = 0 ; i<= n; i++){
            square = i*i+square;
        }
        System.out.println("square: "+square);
    }
}