// package 25. Stack;
// reverse a string using a stack

import java.util.*;
public class s3 {
    public static String reverseStrng(String str){
       Stack<Character> s = new Stack<>();
       int idx = 0;
       while(idx < str.length()) {
        s.push(str.charAt(idx));
        idx++;
       } 

       StringBuilder result = new StringBuilder("");
       while(!s.isEmpty()) {
        char curr = s.pop();
        result.append(curr);
       }
       return result.toString();
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseStrng(str));
    }
}
