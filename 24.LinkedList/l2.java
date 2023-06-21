// package 24.LinkedList;

import java.util.LinkedList; //jcf  
public class l2 {
    public static void main(String[] args) {
        // create -
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(0);

        // 0 -> 1 -> 2
        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    
}
