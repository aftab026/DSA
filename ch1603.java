// for a given set of String print the largest string.
public class ch1603 {
    public static void main(String[] args) {
        // String fruits[] = {"apple", "mango", "banana"};

        // String largest = fruits[0];
        // for(int i=1; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i]) < 0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);


        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<= 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
