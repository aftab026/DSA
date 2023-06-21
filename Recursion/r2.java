// package 19.Recursion.Recursion;
// print numbers from n to 1 (increasing order)
public class r2 {
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}