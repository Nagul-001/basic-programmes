import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num= in.nextInt();
        fibonacci object=new fibonacci();
        object.fibonacciSequence(num);

    }
    public void fibonacciSequence(int num){
        int a=-1,b=1,c;
        for (int i = 0; i < num; i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
