//for a given String convert each the first letter of each word to uppercase.
public class ch1604 {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
            } else{
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am shradha";
        System.out.println(toUpperCase(str));
    }
}
