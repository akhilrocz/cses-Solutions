import java.util.*;

public class Borze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                sb.append('0');
            }
            if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                sb.append('1');
                ++i;
            }
            if (s.charAt(i) == '-' && s.charAt(i + 1) == '-') {
                sb.append('2');
                ++i;
            }
        }
        System.out.println(sb.toString());
    }
}
