public class palindrome {
    public static void main(String[] args) {
        boolean result=isPalindrome("markram");
        System.out.println(result);
    }
    static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while (start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
