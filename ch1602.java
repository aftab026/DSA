//given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.
import java.util.*;
public class ch1602 {
    public static float getShortestPath(String path){
        int x =0, y = 0;
        for(int i=0; i<path.length(); i++){
           char dir = path.charAt(i);
            // south
            if(dir == 'S'){
                y--;
            }
            // north
            else if(dir == 'N'){
                y++;
            }
            // west
            else if(dir == 'W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));


        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1.equals(s3)){
        //     System.out.println("String are equals");
        // } else{
        //     System.out.println("String are not equals");
        // }


        // substring
        String str = "HelloWorld";
        // System.out.println(subString(str, 0, 5));

        System.out.println(str.substring(0,5));
    }
    
}
