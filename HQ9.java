import java.util.*;

public class HQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.contains("H") || s.contains("Q") || s.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
