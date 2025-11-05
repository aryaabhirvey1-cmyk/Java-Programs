public class Strings{
    public static void main(String[] args){
        String n = "HELLO";

        int l = n.length()-1;

        for(int i = l; i>=0 ; i-- ){
            System.out.println(n.charAt(i));
        }
    }
}