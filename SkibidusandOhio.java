import java.util.*;

public class SkibidusandOhio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            int result = minLength(s);
            System.out.println(result);
        }
        scanner.close();
    }

    public static int minLength(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return 1;
            }
        }
        return s.length();
    }
}

