import java.util.*;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String s = "codeforces";
        scanner.nextLine();
        while (t-- > 0) {
            char c = scanner.next().charAt(0);
            if (s.indexOf(c) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
