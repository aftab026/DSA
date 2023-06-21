import java.util.*;

public class ch11 {
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static int calculateSum(int a, int b) { // parameter or formal parameter
        int sum = a + b;
        return sum;
        
    }

    public static void swap(int a1, int b1){
        //swap
        int temp = a1;
        a1 = b1;
        b1 = temp;

        System.out.println("a = " + a1);
        System.out.println("b = " + b1);

    }

    public static int multiply(int a2, int b2){
        int product = a2*b2;
        return product;
    }

    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<= n; i++) {
            f = f*i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    // //func to calc sum of 2 nums
    // public static int sum(int a, int b) {
    //     return a + b;
    // }
    // //func to calc sum of 3 nums
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }

    //func to calc int sum
    public static int sum(int a, int b) {
        return a + b;
    }
    //func to calc float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    // //only for n>2
    // public static boolean isPrime(int n) {
    //     //corner cases
    //     //2
    //     if(n == 2){
    //         return true;
    //     }
    //     //boolean isPrime = true;
    //     for(int i = 2; i <= n-1; i++) { // completely dividing
    //         if(n % i == 0) {
    //             //isPrime = false;
    //             return false;
    //             //break;
    //         }
    //     }
    //     //return isPrime;
    //     return true;
    // }

    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) { // true
                System.out.println(i+" ");

            }
        }
        System.out.println();
    }

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum +" = " + decNum);
    }

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0) {
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary form of " + myNum + " = "+ binNum);
    }

    public static void main(String[] args) {
        printHelloWorld(); // function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b); // arguments or actual parameters
        System.out.println("Sum is :" + sum);


        //swap - values exchange
        int a1 = 5;
        int b1 = 10;
        swap(a1, b1);


        int a2 = 3;
        int b2 = 5;
        int prod = multiply(a2, b2);
        System.out.println("a2 * b2 = "  + prod);
        prod = multiply(10, 20);
        System.out.println("a * b = " + prod);


        int fact = factorial(4);
        System.out.println("factori is : "  + fact);
        //System.out.println(factorial(7));


        System.out.println(binCoeff(5, 2));


        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));


        System.out.println(isPrime(6));
        primeInRange(20);

        binToDec(101);


        decToBin(7);
        

    }

}
