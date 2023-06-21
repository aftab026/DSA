
// package 35.Hashing;
import java.util.*;

public class h1 {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);

        System.out.println(hm);

        // // get
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Iraq"));

        // // containsKey
        // System.out.println(hm.containsKey("India")); //true
        // System.out.println(hm.containsKey("Iraq")); //false

        // // remove
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // size
        System.out.println(hm.size());

        // Is Empty
        // hm.clear();
        System.out.println(hm.isEmpty());

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key=" + k + ", value=" + hm.get(k));
        }

    }
}
