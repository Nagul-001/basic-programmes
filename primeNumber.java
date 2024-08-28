public class primeNumber {
    public static void main(String[] args) {
        int number=16;
        if(isPrime(number))
            System.out.println(number+" is a Prime Number");
        else
            System.out.println(number+" is not a Prime Number");
    }
    static boolean isPrime(int num){
        if(num<2)
            return false;
        for (int i = 2; i < num; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
