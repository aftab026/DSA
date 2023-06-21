// string
import java.util.*;
public class ch1601 {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrom
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // char arr[]  = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // //string arr immutable

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);


        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());


        //concatenation
        // String firstName = "Shradha";
        // String lastName = "Khapra";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName.charAt(0));

        // printLetters(fullName);


        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
    
}
