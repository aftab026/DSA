import java.util.*;

public class n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();

        for (int i = 2; i <= 10; i++) {
            // System.out.println(i);

            if (n >= i) {
                if (n / i == 0) {
                    System.out.println("valid");
                } else if (n / i != 0) {
                    System.out.println("invalid");
                }
            } else {
                System.out.println("k is small");
            }

        }

    }
}
