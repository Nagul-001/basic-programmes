import java.util.*;
public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(num%2==0){
            System.out.println(num+" is an Even Number");
        }else {
            System.out.println(num+" is an Odd Number");
        }
    }
}
