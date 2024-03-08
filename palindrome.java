import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=in.nextInt();
        if(isPalindrome(num))
            System.out.println(num+" is a palindrome");
        else
            System.out.println(num+" is not a palindrome");
    }
    static boolean isPalindrome(int n){
        int temp=n;
        int rev=0,rem=0;
        while (n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        if(temp==rev){
            return true;
        }
        return false;
    }
}
