import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=in.nextInt();
        int sumOfDigits=0;
      
        while (num!=0){
            int rem=num%10;
            sumOfDigits+=rem;
            num/=10;
        }
        System.out.println(sumOfDigits);
      
    }
}
