// package 23.ArrayList;

import java.util.ArrayList;
// import java.util.*;

public class r1 {
    public static void main(String[] args) {
        // String | Boolean | Float
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); //o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size());



        System.out.println(list);

        list.add(1, 9); //o(n)
        System.out.println(list);

        // get operation - o(1)

        int element = list.get(2);
        System.out.println(element); 


        // delete 
        list.remove(2);
        System.out.println(list);

        // set element at index
        list.set(2, 10);
        System.out.println(list);

        // contains element
        System.out.println(list.contains(1));
        System.out.println(list.contains(100));

        // print the arraylist
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
