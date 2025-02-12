import java.util.*;

public class Alternatively {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        if (s.length() == 1) {
            System.out.println("Yes");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
