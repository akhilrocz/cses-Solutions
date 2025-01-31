import java.util.*;

public class StringProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (isVowel(current) && !isVowel(prev)) {
                sb.setCharAt(i - 1, '.');
            }
        }
        System.out.println(sb.toString());
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
