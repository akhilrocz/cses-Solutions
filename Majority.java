import java.util.*;

public class Majority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int forCount = 0;
        int againstCount = 0;
        while (n-- > 0) {
            String s = scanner.next();
            if (s.equals("For")) {
                forCount++;
            } else if (s.equals("Against")) {
                againstCount++;
            }
        }
        if (forCount > againstCount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
