
import java.util.*;
class countFlips{
    // public countFlips(String s) {
    //     //TODO Auto-generated constructor stub
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String s = sc.nextLine();
        countFlips cf = new countFlips();
        // System.out.println(cf.flipcounts(s));
       int result= flipcounts(s);
       System.out.println(result);

sc.close();
        
    }

    public static int flipcounts(String sc){
        int count = 0 ;
        for(int i =0 ; i<sc.length()-1;i+=2){

            if(sc.charAt(i) != sc.charAt(i+1)){
                count++;
            }

        }
        return count;
    }

}