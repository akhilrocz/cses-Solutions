import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String s = scanner.next().toLowerCase();

        if (s.length() != n) {
            System.out.print("NO");
            return;
        }
        if (s.length() < 26) {
            System.out.print("NO");
            return;
        }

        Set<Character> set = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            set.add(c);
        }

        Set<Character> present = new HashSet<>();
        for (char c : s.toCharArray()) {
            present.add(c);
        }

        if (present.containsAll(set)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
