package ej6;

public class StringUtil {

    public static String replicate(char c, int n) {
        String rep = "";
        for (int i = 0; i < n; i++) {
            rep += c;
        }
        return rep;
    }

    public static String rpad(String s, char c, int n) {
        return s + replicate(c, n - s.length());
    }

    public static String ltrim(String s) {
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            System.out.println("s.charAt(i)  " + s.charAt(i));
            i++;
        }
        return s.substring(i);
    }

    public static String rtrim(String s) {
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        return s.substring(0,i+1);
    }
    /*
    public static String trim(String s){

    }

    public static int indexOfN(String s, char c, int n){

    }
    */
}
