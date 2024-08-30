import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= in.nextInt();
        int rev=0,rem;
        while (number>0){
            rem=number%10;
            rev=(rev*10)+rem;
            number/=10;
        }
        System.out.println(rev);
    }
}
