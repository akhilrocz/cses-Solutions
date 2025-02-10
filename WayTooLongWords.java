import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            if (s.length() <= 10) {
                System.out.println(s);
            } else {
                char firstChar = s.charAt(0);
                char lastChar = s.charAt(s.length() - 1);
                int remLength = s.length() - 2;
                System.out.println(String.valueOf(firstChar) + remLength + String.valueOf(lastChar));
            }
        }
    }
}
