import java.util.*;

public class StringProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouyAEIOUY";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                sb.append(".").append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb.toString());
    }

}
