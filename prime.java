import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is a prime number");
        }else {
            System.out.println(num+" is not a prime number");
        }
    }
    static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
