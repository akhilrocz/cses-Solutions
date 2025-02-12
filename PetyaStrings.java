import java.util.*;

public class PetyaStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 < c2) {
                System.out.println(-1);
                return;
            } else if (c1 > c2) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
