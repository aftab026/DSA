public class ch11ps {

    public static int avgOfNum(int a, int b, int c){
        return (a+b+c)/3;
    
    }

    public static boolean isEven(int n)  {
        if(n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;

            if (number == reverse) {
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        System.out.println(avgOfNum(a, b, c));

        System.out.println(isEven(0));


        System.out.println(isPalindrome(123));
    }
    
}
